package com.christycatlin.customer;

import com.christycatlin.accounts.AcctDBImpl;
import com.christycatlin.bank.Main;
import com.christycatlin.connections.ConnectionFactory;
import com.christycatlin.employee.EmployeeDBImpl;
import java.sql.*;
import java.util.Scanner;


public class CustomerDBImpl implements ICustomerDB {

    private static Statement statement = null;
    Connection connection = null;

    public CustomerDBImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override //this one is working
    public void custLogin(int id, String pass) throws SQLException {
        String sql = "select Cust_ID, password from customer where Cust_ID = " + id;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        Main mainMenu = new Main();
        if (resultSet.next()) {
            int custId = resultSet.getInt(1);
            String password = resultSet.getString(2);
            if (pass.equalsIgnoreCase(password)) {
                System.out.println("Customer Login Successful");
                CustomerMenu customerMenu = new CustomerMenu(custId);
                customerMenu.CustMainMenu(custId);
            } else {
                System.out.println("Password is Incorrect");
                mainMenu.welcomeScreen();
            }
        } else {
            System.out.println("No Record Found");
            mainMenu.welcomeScreen();
        }

    }

    @Override //working
    public void newAcct() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Answer the Following Questions to Apply for a New Account");
        System.out.println("Please Type Your First Name");
        String name = scanner.next();
        System.out.println("Please Type Your Last Name");
        String surName = scanner.next();
        System.out.println("Please Type Your Phone Number (no spaces)");
        String phone = scanner.next();
        System.out.println("Please Type Your Email Address");
        String email = scanner.next();
        System.out.println("Please Select Type of Account: Checking or Savings");
        String type = scanner.next();
        System.out.println("Please Type in Your Starting Deposit");
        double deposit = scanner.nextDouble();
        System.out.println("Approving Employee please input your ID");
        int id = scanner.nextInt();
        System.out.println("Please Input Password");
        String pass = scanner.next();
        EmployeeDBImpl employeeDB = new EmployeeDBImpl();
        employeeDB.empAccountApproval(id, pass, name, surName, phone, email, type, deposit);

    }

    @Override // working
    public void startTransfer(int custID) throws SQLException {
        AcctDBImpl acctDB = new AcctDBImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What Account Number would you like to make the transfer FROM");
        int acctId = scanner.nextInt();
        String sql = "select Cust_ID, Balance from accounts where Acct_Num =" + acctId;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {
            int custId1 = resultSet.getInt(1);
            double balance = resultSet.getDouble(2);
            if (custId1 == custID) {
                System.out.println("What amount would you like to transfer From Account " + acctId);
                double transfer = scanner.nextDouble();
                if (transfer > balance) {
                    System.out.println("Insufficient Funds");
                } else {
                    double newBalance = balance - transfer;
                    connection.setAutoCommit(false);
                    acctDB.withdraw(custID, acctId, transfer);
                    System.out.println("What Account would you like to transfer " + transfer + " into?");
                    int acctID2 = scanner.nextInt();
                    String sql4 = "select Cust_ID, Balance from accounts where Acct_Num =" + acctID2;
                    Statement statement2 = connection.createStatement();
                    ResultSet resultSet2 = statement2.executeQuery(sql4);
                    if (resultSet2.next()) {
                        int custId2 = resultSet2.getInt(1);
                        double balance2 = resultSet2.getDouble(2);
                        double newBalance2 = balance2 + transfer;
                        if (custID == custId2) {
                            acctDB.deposit(custID,acctID2,transfer);
                            System.out.println("You have transferred $" + transfer + " from Account #"
                                    + acctId + "Which has a New Balance of $" + newBalance + " into Account #"
                                    + acctID2 + " Which has a New Balance of $" + newBalance2);
                            connection.commit();
                        } else {
                            System.out.println("Requires Receiving customer Approval");
                            acceptTransfer(custID, acctId, custId2, acctID2, transfer);
                        }
                    } else {
                        System.out.println("No Account Found");
                        connection.rollback();
                    }
                }
            } else {
                System.out.println("This requires login of Customer " + custId1);
            }
        } else {
            System.out.println("No Account Found");
        }
    }

        @Override //working
        public void acceptTransfer(int custID, int acctId, int custId2, int acctID2, double transfer) throws SQLException {
            System.out.println("Customer " + custId2 + "Please input password");
            Scanner scanner = new Scanner(System.in);
            String pass = scanner.next();
            String sql5 = "select password from customer where Cust_ID = " + custId2;
            Statement statement5 = connection.createStatement();
            ResultSet resultSet5 = statement5.executeQuery(sql5);
            if (resultSet5.next()) {
                String password = resultSet5.getString(1);
                if (pass.equalsIgnoreCase(password)) {
                    System.out.println("Customer Login Successful Transfer Processing");
                    AcctDBImpl acctDB = new AcctDBImpl();
                    acctDB.deposit(custId2,acctID2,transfer);
                    System.out.println("You have transferred $" + transfer + " from Account #"
                            + acctId + " into Account #" + acctID2);
                    connection.commit();
                } else {
                    System.out.println("Password is Incorrect");
                    connection.rollback();

                }

            }
        }

    @Override
    public void newCust(String name, String surName, String phone, String email, String password) throws SQLException {
        String sql = "insert into customer (First_name, Last_name, phone, email, password) values (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, surName);
        preparedStatement.setString(3, phone);
        preparedStatement.setString(4, email);
        preparedStatement.setString(5, password);
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("New Customer Saved");
        } else {
            System.out.println("Oops! Something went wrong");
            Main mainMenu = new Main();
            mainMenu.welcomeScreen();
        }
    }

    @Override //working
    public void getCust() throws SQLException {
        String sql = "select customer.cust_id, first_name, last_name, Acct_Num, Acct_type, Balance from customer left join accounts on customer.cust_id = accounts.cust_id;";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            int custID = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String surName = resultSet.getString(3);
            int acctID = resultSet.getInt(4);
            String acctType = resultSet.getString(5);
            double bal = resultSet.getDouble(6);
            System.out.println("Customer ID: " + custID + ", Customer Full Name: " + name + " " + surName
                + ", Account Number: " + acctID + ", Account Type: " + acctType +", Current Balance: " +bal);
        }
        System.out.println("End of Account List");

    }
}


