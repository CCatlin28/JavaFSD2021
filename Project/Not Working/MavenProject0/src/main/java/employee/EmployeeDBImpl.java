package employee;

import accounts.AcctDBImpl;
import bank.Main;
import connections.ConnectionFactory;
import customer.CustomerDBImpl;
import transactions.TransactionsDBImpl;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeDBImpl implements IEmployeeDB{

    private static Statement statement = null;
    Connection connection = null;

    public EmployeeDBImpl(){
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void confirmNewAccount(String name, String surName, String phone, String email, String type, double deposit) throws SQLException {
        Main mainMenu = new Main();
        System.out.println("****Customer Application for New Account****");
        System.out.println("Customer Name is " + name +" " +surName);
        System.out.println("Customer Contact information:");
        System.out.println("Phone: " +phone +", Email: "+ email);
        System.out.println("New Account Information:");
        System.out.println("Requested Account Type: " + type + ", Proposed Stating Balance: $"+deposit);
        CustomerDBImpl customer = new CustomerDBImpl();
        AcctDBImpl acctDB = new AcctDBImpl();
        TransactionsDBImpl transactionsDB = new TransactionsDBImpl();
        customer.getCust();
        System.out.println("Is Account Approved or Denied: Input 'A' for Approved or 'D' for Denied");
        Scanner scanner = new Scanner(System.in);
        try {
            switch (scanner.next()) {
                case "A":{
                    System.out.println("Is Customer New? Input 'Y' for Yes and 'N' for No.");
                    switch (scanner.next()) {
                        case "Y":
                            System.out.println("What is new Customers password?");
                            String pass = scanner.next();
                            //adding customer
                            customer.newCust(name, surName, phone, email, pass);
                            String sql = "select MAX(Cust_ID) from customer";
                            Statement statement = connection.createStatement();
                            ResultSet resultSet = statement.executeQuery(sql);
                            if (resultSet.next()) {
                                int id = resultSet.getInt(1);
                                //adding account
                                acctDB.createAcct(id, type, deposit);
                                String sql2 = "select MAX(Acct_Num) from accounts";
                                Statement statement2 = connection.createStatement();
                                ResultSet resultSet2 = statement2.executeQuery(sql2);
                                if (resultSet2.next()) {
                                    int acctNum = resultSet2.getInt(1);
                                    transactionsDB.logDeposit(id, acctNum, 0, deposit, deposit);
                                    break;
                                }
                            }
                        case "N": {
                            System.out.println("What is the Existing Customers ID?");
                            int id = scanner.nextInt();
                            acctDB.createAcct(id, type, deposit);
                            String sql2 = "select MAX(Acct_Num) from accounts";
                            Statement statement2 = connection.createStatement();
                            ResultSet resultSet2 = statement2.executeQuery(sql2);
                            if (resultSet2.next()) {
                                int acctNum = resultSet2.getInt(1);
                                transactionsDB.logDeposit(id, acctNum, 0, deposit, deposit);
                                break;
                            }
                        }
                        default: {
                            System.out.println("Something went wrong Please start over");
                            break;
                        }
                    }
                    break;
                }
                case "D": {
                    System.out.println("We are sorry your Account is not approved");
                    break;
                }
                default:
                    System.out.println("Something went wrong, please Try Again Later");
                    break;
            }
        } catch (InputMismatchException exception){
            System.out.println("Something went wrong, please Try Again Later");
        }
        mainMenu.welcomeScreen();
    }

    @Override
    public void empLogin(int id, String pass) throws SQLException {
        String sql = "select Emp_ID, password from employee where Emp_ID = " + id;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        Main mainMenu = new Main();
        if (resultSet.next()) {
            int empId = resultSet.getInt(1);
            String password = resultSet.getString(2);
            if (pass.equalsIgnoreCase(password)) {
                System.out.println("Employee Login Successful");
                EmployeeMenu employeeMenu = new EmployeeMenu(empId);
                employeeMenu.EmpMainMenu(empId);
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
    public void empAccountApproval(int id, String pass, String name, String surName, String phone, String email, String type, double deposit) throws SQLException {
        String sql = "select password from employee where Emp_ID = " + id;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        Main mainMenu = new Main();
        if (resultSet.next()) {
            String password = resultSet.getString(1);
            if (pass.equalsIgnoreCase(password)) {
                System.out.println("Employee Login Successful");
                confirmNewAccount(name,surName, phone, email, type, deposit);
            } else {
                System.out.println("Password is Incorrect");
                mainMenu.welcomeScreen();
            }
        } else {
            System.out.println("No Record Found");
            mainMenu.welcomeScreen();
        }
    }
}
