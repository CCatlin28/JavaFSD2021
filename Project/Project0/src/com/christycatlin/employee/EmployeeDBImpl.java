package com.christycatlin.employee;

import com.christycatlin.accounts.AcctDBImpl;
import com.christycatlin.bank.Main;


import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeDBImpl implements IEmployeeDB{

    private static Statement statement = null;
    Connection connection = null;

    public EmployeeDBImpl(){

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
        AcctDBImpl acctDB = new AcctDBImpl();
        acctDB.getAcct();
        System.out.println("Is Account Approved or Denied: Input 'A' for Approved or 'D' for Denied");
        Scanner scanner = new Scanner(System.in);
        try {
            switch (scanner.next()) {
                case "A":
                    // if new customer
                    //update customer table
                    //pull new customer ID
                    //update account table
                    //else update account table
                case "D":
                    System.out.println("We are sorry your Account is not approved");
                    mainMenu.welcomeScreen();
                default:
                    System.out.println("Something went wrong, please Try Again Later");
                    mainMenu.welcomeScreen();
            }
        } catch (InputMismatchException exception){
            System.out.println("Something went wrong, please Try Again Later");
            mainMenu.welcomeScreen();
        }



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
        String sql = "select Emp_ID, password from employee where Emp_ID = " + id;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        Main mainMenu = new Main();
        if (resultSet.next()) {
            int empId = resultSet.getInt(1);
            String password = resultSet.getString(2);
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
