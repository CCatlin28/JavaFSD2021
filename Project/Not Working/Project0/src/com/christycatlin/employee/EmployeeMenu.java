package com.christycatlin.employee;

import com.christycatlin.accounts.AcctDBImpl;
import com.christycatlin.bank.Main;
import com.christycatlin.transactions.TransactionsDBImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeMenu {
    public EmployeeMenu(int id) {
    }

    public void EmpMainMenu(int id) throws SQLException {
        System.out.println("********************");
        System.out.println("Welcome Valued Employee");
        System.out.println("********************");
        System.out.println("Please Make a Selection from the Menu");
        System.out.println("1. View Accounts");
        System.out.println("2. View Transactions");
        System.out.println("3. Log Out");
        System.out.println("4. Exit Banking Application");

        Scanner scanner = new Scanner(System.in);
        AcctDBImpl acctDB = new AcctDBImpl();
        try {
            switch (scanner.nextInt()){
                case 1:
                    System.out.println("Please Make a Selection from the Menu");
                    System.out.println("1. View All Accounts");
                    System.out.println("2. View Accounts by Customer");
                    switch (scanner.nextInt()){
                        case 1:
                            acctDB.getAcct();
                            EmpMainMenu(id);
                            break;
                        case 2:
                            System.out.println("Input Customer ID to View Accounts");
                            int custID = scanner.nextInt();
                            acctDB.getAcctByCustID(custID);
                            EmpMainMenu(id);
                            break;
                        default:
                            System.out.println("Selection Not Available");
                            EmpMainMenu(id);
                    }
                    break;
                case 2:
                    System.out.println("Please Make a Selection from the Menu");
                    System.out.println("1. View All Transactions");
                    System.out.println("2. View Transactions by Customer");
                    System.out.println("3. View Transactions by Account");
                    TransactionsDBImpl transactionsDB = new TransactionsDBImpl();
                    switch (scanner.nextInt()){
                        case 1:
                            transactionsDB.viewAll();
                            EmpMainMenu(id);
                            break;
                        case 2:
                            System.out.println("Input Customer ID to View Transactions");
                            int custID = scanner.nextInt();
                            transactionsDB.viewCust(custID);
                            EmpMainMenu(id);
                            break;
                        case 3:
                            System.out.println("Input Account Number to View Transactions");
                            int acctID = scanner.nextInt();
                            transactionsDB.viewAcct(acctID);
                            EmpMainMenu(id);
                            break;
                        default:
                            System.out.println("Selection Not Available");
                            EmpMainMenu(id);
                    }
                    break;
                case 3:
                    System.out.println("Goodbye, Have a Good Day!");
                    Main main = new Main();
                    main.welcomeScreen();
                    break;
                case 4:
                    System.out.println("Goodbye, Have a Good Day!");
                    Connection connection = null;
                    connection.close();
                    break;
                default:
                    System.out.println("Please input a Number from the Menu");
                    EmpMainMenu(id);
                    break;
            }
        } catch (InputMismatchException exception) {
            System.out.println("Please input a Number from the Menu");
            EmpMainMenu(id);
        }
    }
}
