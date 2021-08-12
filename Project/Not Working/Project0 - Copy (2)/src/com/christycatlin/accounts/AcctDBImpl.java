package com.christycatlin.accounts;

import com.christycatlin.bank.Main;
import com.christycatlin.connections.ConnectionFactory;
import com.christycatlin.customer.CustomerMenu;
import com.christycatlin.transactions.TransactionsDBImpl;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AcctDBImpl implements IAcctDB{
    private static Statement statement = null;
    Connection connection = null;

    public AcctDBImpl(){
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void getAcct() throws SQLException {
        List<Accounts> accounts = new ArrayList<>();
  //      String sql = "select * from accounts";
        String sql = "CALL `project`.`GetAccount`()";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            int acctID = resultSet.getInt(1);
            int custID = resultSet.getInt(2);
            String acctType = resultSet.getString(3);
            double bal = resultSet.getDouble(4);
            Accounts accounts1 = new Accounts(acctID,custID,acctType,bal);
            accounts.add(accounts1);
            System.out.println(accounts1);
        }
        System.out.println("End of Account List");
    }

    @Override
    public void getAcctByCustID(int custId) throws SQLException {
        List<Accounts> accounts = new ArrayList<>();
        String sql = "select * from accounts where Cust_ID =" + custId;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            int acctNum = resultSet.getInt(1);
            int id = resultSet.getInt(2);
            String acctType = resultSet.getString(3);
            double balance = resultSet.getDouble(4);
            Accounts accounts1 = new Accounts(acctNum, id, acctType, balance);
            accounts.add(accounts1);
            System.out.println(accounts1);
            }
        System.out.println("End of Account List");
    }

    @Override
    public void getAcctByAcctID(int custID, int acctId) throws SQLException {
        List<Accounts> accounts = new ArrayList<>();
        String sql = "select * from accounts where Acct_Num =" + acctId;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()){
            int acctNum = resultSet.getInt(1);
            int id = resultSet.getInt(2);
            String acctType = resultSet.getString(3);
            double balance = resultSet.getDouble(4);
            if (id == custID) {
                Accounts accounts1 = new Accounts(acctNum, id, acctType, balance);
                accounts.add(accounts1);
                System.out.println(accounts);
            } else {
                System.out.println("You do not have access to this account");
                CustomerMenu menu = new CustomerMenu(custID);
                menu.CustMainMenu(custID);
            }
        } else {
            System.out.println("No Account Found");
        }
    }

    @Override
    public void withdraw(int id, int acctId, double withdrawAmt) throws SQLException {
        String sql = "select Cust_ID, Balance from accounts where Acct_Num =" + acctId;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()){
            int custId = resultSet.getInt(1);
            double balance = resultSet.getDouble(2);
            if(custId != id){
                System.out.println("You do not have access to this account");
                CustomerMenu menu = new CustomerMenu(id);
                menu.CustMainMenu(id);
            } else if (withdrawAmt>balance){
                System.out.println("Insufficient Funds");
            } else {
                double newBalance = balance-withdrawAmt;
                TransactionsDBImpl transactionsDB = new TransactionsDBImpl();
                transactionsDB.logWithdraw(custId,acctId, balance, withdrawAmt, newBalance);
            }
        } else {
            System.out.println("Unavailable Option Please Try Again");
            CustomerMenu menu = new CustomerMenu(id);
            menu.CustMainMenu(id);
        }
    }

    @Override
    public void deposit(int id, int acctId, double depositAmt) throws SQLException{
        String sql = "select Cust_ID, Balance from accounts where Acct_Num =" + acctId;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()){
            int custId = resultSet.getInt(1);
            double balance = resultSet.getDouble(2);
            if(custId != id){
                System.out.println("You do not have access to this account");
                CustomerMenu menu = new CustomerMenu(id);
                menu.CustMainMenu(id);
            } else {
                double newBalance = balance+depositAmt;
                TransactionsDBImpl transactionsDB = new TransactionsDBImpl();
                transactionsDB.logDeposit(custId,acctId, balance, depositAmt, newBalance);
            }
        } else {
            System.out.println("Unavailable Option Please Try Again");
            CustomerMenu menu = new CustomerMenu(id);
            menu.CustMainMenu(id);
        }
    }

    @Override
    public void createAcct(int custID, String type, double balance) throws SQLException {
        String sql = "insert into accounts (Cust_id, Acct_type, balance) values (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, custID);
        preparedStatement.setString(2, type);
        preparedStatement.setDouble(3, balance);
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("New Account Saved");
        } else {
            System.out.println("Oops! Something went wrong");
            Main mainMenu = new Main();
            mainMenu.welcomeScreen();
        }
    }
}
