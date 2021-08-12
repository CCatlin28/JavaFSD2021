package customer;

import accounts.AcctDBImpl;
import bank.Main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerMenu {


    public CustomerMenu(int custId) {
    }

    public void CustMainMenu(int id) throws SQLException {
        System.out.println("********************");
        System.out.println("Welcome Valued Customer");
        System.out.println("********************");
        System.out.println("Please Make a Selection from the Menu");
        System.out.println("1. View Your Accounts");
        System.out.println("2. Make a Withdrawal");
        System.out.println("3. Make a Deposit");
        System.out.println("4. Start a Transfer");
        System.out.println("5. Log Out");
        System.out.println("6. Exit Banking Application");
        Scanner scanner = new Scanner(System.in);
        AcctDBImpl acctDB = new AcctDBImpl();
        CustomerDBImpl customerDB = new CustomerDBImpl();
        try {
            switch (scanner.nextInt()){
                case 1:
                    System.out.println("1. View All Accounts");
                    System.out.println("2. View by Account Number.");
                    int menu = scanner.nextInt();
                    if (menu==1) {
                        acctDB.getAcctByCustID(id);
                    } else if(menu == 2){
                        System.out.println("Input Account Number To View");
                        int acctID = scanner.nextInt();
                        acctDB.getAcctByAcctID(id, acctID);
                    } else {
                        System.out.println("Please input a valid menu option");
                    }
                    CustMainMenu(id);
                    break;
                case 2:
                    System.out.println("Which Account Would you like to withdraw money from ?");
                    int account = scanner.nextInt();
                    System.out.println("How Much Would you like to withdraw?");
                    double withdraw = scanner.nextDouble();
                    acctDB.withdraw(id, account, withdraw);
                    CustMainMenu(id);
                    break;
                case 3:
                    System.out.println("Which Account Would you like to deposit money into ?");
                    int account1 = scanner.nextInt();
                    System.out.println("How Much Would you like to deposit?");
                    double deposit = scanner.nextDouble();
                    acctDB.deposit(id, account1, deposit);
                    CustMainMenu(id);
                    break;
                case 4:
                    customerDB.startTransfer(id);
                    CustMainMenu(id);
                    break;
                case 5:
                    System.out.println("Goodbye, Have a Good Day!");
                    Main main = new Main();
                    main.welcomeScreen();
                    break;
                case 6:
                    System.out.println("Goodbye, Have a Good Day!");
//                    Connection connection = null;
//                    connection.close();
                    break;
                default:
                    System.out.println("Please input a Number from the Menu");
                    CustMainMenu(id);
                    break;
            }
        } catch (InputMismatchException exception) {
            System.out.println("Please input a Number from the Menu");
            CustMainMenu(id);
        }
    }
}