package com.christycatlin.customer;

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

    @Override
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

    @Override
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

    @Override
    public void startTransfer(int custID) throws SQLException {
        CustomerMenu menu = new CustomerMenu(custID);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What Account Number would you like to make the transfer FROM");
        int acctId = scanner.nextInt();
        String sql = "select Cust_ID, Balance from accounts where Acct_ID =" + acctId;
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
                    menu.CustMainMenu(custID);
                } else {
                    double newBalance = balance - transfer;
                    String safety = "rollback; start transaction";
                    ResultSet resultSetSafety = statement.executeQuery(safety);
                    String sql2 = " update accounts set balance = ? where Acct_Id = " + acctId;
                    PreparedStatement preparedStatement = connection.prepareStatement(sql2);
                    preparedStatement.setDouble(1, newBalance);
                    String sql3 = "insert into transactions Cust_ID, Acct_ID, start_bal, withdraw, end_bal values (?, ?, ?, ?, ?)";
                    PreparedStatement preparedStatement1 = connection.prepareStatement(sql3);
                    preparedStatement1.setInt(1, custID);
                    preparedStatement1.setInt(2, acctId);
                    preparedStatement1.setDouble(3, balance);
                    preparedStatement1.setDouble(4, transfer);
                    preparedStatement1.setDouble(5, newBalance);
                    System.out.println("What Account would you like to transfer " + transfer + " into?");
                    int acctID2 = scanner.nextInt();
                    String sql4 = "select Cust_ID, Balance from accounts where Acct_ID =" + acctID2;
                    Statement statement2 = connection.createStatement();
                    ResultSet resultSet2 = statement2.executeQuery(sql4);
                    if (resultSet.next()) {
                        int custId2 = resultSet2.getInt(1);
                        double balance2 = resultSet2.getDouble(2);
                        double newBalance2 = balance2 + transfer;
                        if (custID == custId2) {
                            String sql5 = " update accounts set balance = ? where Acct_Id = " + acctId;
                            PreparedStatement preparedStatement3 = connection.prepareStatement(sql5);
                            preparedStatement.setDouble(1, newBalance);
                            String sql6 = "insert into transactions (Cust_ID, Acct_ID, start_bal, deposit, end_bal values (?, ?, ?, ?, ?)";
                            PreparedStatement preparedStatement4 = connection.prepareStatement(sql6);
                            preparedStatement1.setInt(1, custID);
                            preparedStatement1.setInt(2, acctId);
                            preparedStatement1.setDouble(3, balance);
                            preparedStatement1.setDouble(4, transfer);
                            preparedStatement1.setDouble(5, newBalance2);
                            System.out.println("You have transferred $" + transfer + " from Account #"
                                    + acctId + "Which has a New Balance of $" + newBalance + " into Account #"
                                    + acctID2 + " Which has a New Balance of $" + newBalance2);
                            String clear = "commit";
                            ResultSet resultSetClear = statement.executeQuery(clear);
                            menu.CustMainMenu(custID);
                        } else {
                            System.out.println("Requires Receiving customer Approval");
                            acceptTransfer(custID, acctId, custId2, acctID2, transfer);
                        }
                    } else {
                        System.out.println("No Account Found");
                    }
                }
            } else {
                System.out.println("This requires login of Customer " + custId1);
                menu.CustMainMenu(custID);
            }
        } else {
            System.out.println("No Account Found");
            menu.CustMainMenu(custID);
        }
    }

        @Override
        public void acceptTransfer(int custID, int acctId, int custId2, int acctID2, double transfer) throws SQLException {
            System.out.println("Customer " + custId2 + "Please input password");
            Scanner scanner = new Scanner(System.in);
            String pass = scanner.next();
            String sql5 = "select Cust_ID, password, balance from customer where Cust_ID = " + custId2;
            Statement statement5 = connection.createStatement();
            ResultSet resultSet5 = statement5.executeQuery(sql5);
            if (resultSet5.next()) {
                String password = resultSet5.getString(2);
                double balance = resultSet5.getDouble(3);
                double newBalance = balance + transfer;
                if (pass.equalsIgnoreCase(password)) {
                    System.out.println("Customer Login Successful Transfer Processing");
                    String sql6 = " update accounts set balance = ? where Acct_Id = " + acctID2;
                    PreparedStatement preparedStatement6 = connection.prepareStatement(sql6);
                    preparedStatement6.setDouble(1, newBalance);
                    String sql7 = "insert into transactions (Cust_ID, Acct_ID, start_bal, deposit, end_bal values (?, ?, ?, ?, ?)";
                    PreparedStatement preparedStatement7 = connection.prepareStatement(sql7);
                    preparedStatement7.setInt(1, custID);
                    preparedStatement7.setInt(2, acctId);
                    preparedStatement7.setDouble(3, balance);
                    preparedStatement7.setDouble(4, transfer);
                    preparedStatement7.setDouble(5, newBalance);
                    System.out.println("You have transferred $" + transfer + " from Account #"
                            + acctId + " into Account #" + acctID2);
                    String clear = "commit";
                    ResultSet resultSetClear = statement.executeQuery(clear);
                    CustomerMenu menu = new CustomerMenu(custID);
                    menu.CustMainMenu(custID);
                } else {
                    System.out.println("Password is Incorrect");
                    Main mainMenu = new Main();
                    mainMenu.welcomeScreen();
                }

            }
        }
    }


