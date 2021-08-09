package com.christycatlin.accounts;

import com.christycatlin.connections.ConnectionFactory;

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
    public List<Accounts> getAcct() throws SQLException {
        List<Accounts> accounts = new ArrayList<>();
        String sql = "select * from accounts";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            int acctID = resultSet.getInt(1);
            int custID = resultSet.getInt(2);
            String acctType = resultSet.getString(3);
            double bal = resultSet.getDouble(4);
            Accounts accounts1 = new Accounts(acctID,custID,acctType,bal);
            accounts.add(accounts1);
            System.out.println(accounts);

        }
        return accounts;


    }

    @Override
    public List<Accounts> getAcctByCustID(int custId) throws SQLException {
        List<Accounts> accounts = new ArrayList<>();
        String sql = "select * from accounts where Cust_ID =" + custId;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()){
            int acctNum = resultSet.getInt(1);
            int id = resultSet.getInt(2);
            String acctType = resultSet.getString(3);
            double balance = resultSet.getDouble(4);
            Accounts accounts1 = new Accounts(acctNum, id, acctType, balance);
            accounts.add(accounts1);
        } else {
            System.out.println("No Account Found");
        }
        return accounts;
    }



    @Override
    public List<Accounts> getAcctByAcctID(int acctId) throws SQLException {
        List<Accounts> accounts = new ArrayList<>();
        String sql = "select * from accounts where Acct_ID =" + acctId;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()){
            int acctNum = resultSet.getInt(1);
            int id = resultSet.getInt(2);
            String acctType = resultSet.getString(3);
            double balance = resultSet.getDouble(4);
            Accounts accounts1 = new Accounts(acctNum, id, acctType, balance);
            accounts.add(accounts1);
        } else {
            System.out.println("No Account Found");
        }
        return accounts;

    }

    @Override
    public void withdraw(int acctId, double withdrawAmt) throws SQLException {
        String sql = "select Cust_ID, Balance from accounts where Acct_ID =" + acctId;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()){
            int custId = resultSet.getInt(1);
            double balance = resultSet.getDouble(2);
            if (withdrawAmt>balance){
                System.out.println("Insufficient Funds");
            } else {
                double newBalance = balance-withdrawAmt;
                String sql2 = " update accounts set balance = ? where Acct_Id = "+acctId;
                PreparedStatement preparedStatement = connection.prepareStatement(sql2);
                preparedStatement.setDouble(1, newBalance);
                String sql3 = "insert into transactions Cust_ID, Acct_ID, start_bal, withdrawl, end_bal values (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement1 = connection.prepareStatement(sql3);
                preparedStatement1.setInt(1, custId);
                preparedStatement1.setInt(2, acctId);
                preparedStatement1.setDouble(3, balance);
                preparedStatement1.setDouble(4,withdrawAmt);
                preparedStatement1.setDouble(5, newBalance);
                System.out.println("You have withdrawn $" +withdrawAmt +" from Account #" +acctId +" Remaining Balance is $" +newBalance);
            }
        } else {
            System.out.println("No Account Found");
        }

    }

    @Override
    public void deposit(int acctId, double depositAmt) throws SQLException{
        String sql = "select Cust_ID, Balance from accounts where Acct_ID =" + acctId;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()){
            int custId = resultSet.getInt(1);
            double balance = resultSet.getDouble(2);
            double newBalance = balance+depositAmt;
            String sql2 = " update accounts set balance = ? where Acct_Id = "+acctId;
            PreparedStatement preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setDouble(1, newBalance);
            String sql3 = "insert into transactions (Cust_ID, Acct_ID, start_bal, deposit, end_bal values (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql3);
            preparedStatement1.setInt(1, custId);
            preparedStatement1.setInt(2, acctId);
            preparedStatement1.setDouble(3, balance);
            preparedStatement1.setDouble(4,depositAmt);
            preparedStatement1.setDouble(5, newBalance);
            System.out.println("You have deposited $" +depositAmt +" into Account #" +acctId +" New Balance is $" +newBalance);
        } else {
            System.out.println("No Account Found");
        }

    }
}
