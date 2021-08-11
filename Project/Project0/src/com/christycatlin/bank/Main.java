package com.christycatlin.bank;

import com.christycatlin.customer.CustomerDBImpl;
import com.christycatlin.employee.EmployeeDBImpl;
import java.sql.SQLException;
import java.util.InputMismatchException;
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
        CustomerDBImpl customerDB = new CustomerDBImpl();
        Scanner scanner = new Scanner(System.in);
        try {
            switch (scanner.nextInt()) {
                case 1:
                    //Employee Log in
                    System.out.println("Enter Employee ID");
                    int empID = scanner.nextInt();
                    System.out.println("Enter Password");
                    String empPass = scanner.next();
                    EmployeeDBImpl employeeDB = new EmployeeDBImpl();
                    employeeDB.empLogin(empID, empPass);
                break;
                case 2:
                    //Customer Log In
                    System.out.println("Enter Customer ID");
                    int custID = scanner.nextInt();
                    System.out.println("Enter Password");
                    String custPass = scanner.next();
                    customerDB.custLogin(custID, custPass);
                    break;
                case 3:
                    customerDB.newAcct();

                    break;
                case 4:
                    //Exit System
                    System.out.println("Goodbye, Have a Good Day!");
                    break;
                default:
                    System.out.println("Please Select A Number from the Menu");
                    welcomeScreen();
                    break;
            }
        } catch (InputMismatchException exception){
            System.out.println("Please Select a Number from the Menu");
            welcomeScreen();
        }
    }
}