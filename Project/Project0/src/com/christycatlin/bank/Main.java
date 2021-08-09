package com.christycatlin.bank;

import com.christycatlin.accounts.AcctDBImpl;
import com.christycatlin.customer.CustomerDBImpl;


import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        welcomeScreen();

    }

    public static void welcomeScreen() throws SQLException {
        System.out.println("********************");
        System.out.println("Welcome to the JAVA FULL STACK BANK");
        System.out.println("********************");
        System.out.println("Please make a selection:");
        System.out.println("********************");
        System.out.println("1. Employee Log In");
        System.out.println("2. Customer Log In");
        System.out.println("3. New Customer Application");
        System.out.println("4. Exit");
        System.out.println("********************");
        menu();
    }

    public static void menu() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        try {
            switch (scanner.nextInt()) {
                case 1:
                    //Employee Log in
                    System.out.println("Enter Employee ID");
                    int empID = scanner.nextInt();
                    System.out.println("Enter Password");
                    String empPass = scanner.next();
                    //   sysAccess.loginEmployee(empID, empPass);

                    break;
                case 2:
                    //Customer Log In
                    System.out.println("Enter Customer ID");
                    int custID = scanner.nextInt();
                    System.out.println("Enter Password");
                    String custPass = scanner.next();
                    CustomerDBImpl customerDB = new CustomerDBImpl();
                    customerDB.custLogin(custID, custPass);
                    break;
                case 3:
                    System.out.println("Enter First Name");
                    String fName = scanner.next();
                    System.out.println("Enter Last Name");
                    String lName = scanner.next();
                    System.out.println("Enter Phone Number");
                    String cPhone = scanner.next();
                    System.out.println("Enter Email");
                    String cEmail = scanner.next();
                    System.out.println("Enter Desired Password");
                    String cPass = scanner.next();
                    //    sysAccess.addCustomer(fName,lName,cPhone,cEmail,cPass);
                    //New Customer Application

                    break;
                case 4:
                    //Exit System
                    System.out.println("Goodbye, Have a Good Day!");
                    break;
                default:
                    System.out.println("Please Select 1-4");
                    welcomeScreen();
                    break;
            }
        } finally {
            System.out.println("Testing System");

        }
    }
}