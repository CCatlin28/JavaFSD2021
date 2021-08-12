package com.christycatlin.transactions;

import com.christycatlin.connections.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionsDBImpl implements ITransactionDB{

        private static Statement statement = null;
        Connection connection = null;

        public TransactionsDBImpl(){
            try {
                this.connection = ConnectionFactory.getConnection();
            } catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }

    @Override
    public void viewAll() throws SQLException {
        List<Transactions> transactions = new ArrayList<>();
        String sql = "select * from transactions";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            int custId = resultSet.getInt(2);
            int acctId = resultSet.getInt(3);
            double startBal = resultSet.getDouble(4);
            double withdrawl = resultSet.getDouble(5);
            double deposit = resultSet.getDouble(6);
            double endBal = resultSet.getDouble(7);
            Transactions transactions1 = new Transactions(id, custId, acctId,startBal, withdrawl, deposit, endBal);
            transactions.add(transactions1);
            System.out.println(transactions1);
        }
        System.out.println("End of Transaction List");
    }

    @Override
    public List<Transactions> viewCust(int custID) throws SQLException {
        List<Transactions> transactions = new ArrayList<>();
        String sql = "select * from transactions where Cust_ID = " +custID;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            int custId = resultSet.getInt(2);
            int acctId = resultSet.getInt(3);
            double startBal = resultSet.getDouble(4);
            double withdrawl = resultSet.getDouble(5);
            double deposit = resultSet.getDouble(6);
            double endBal = resultSet.getDouble(7);
            Transactions transactions1 = new Transactions(id, custId, acctId,startBal, withdrawl, deposit, endBal);
            transactions.add(transactions1);
            System.out.println(transactions1);
        }
        System.out.println("End of Transaction List");
        return transactions;
        }

    @Override
    public List<Transactions> viewAcct(int acctNum) throws SQLException {
        List<Transactions> transactions = new ArrayList<>();
        String sql = "select * from transactions where Acct_ID = " +acctNum;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            int custId = resultSet.getInt(2);
            int acctId = resultSet.getInt(3);
            double startBal = resultSet.getDouble(4);
            double withdrawl = resultSet.getDouble(5);
            double deposit = resultSet.getDouble(6);
            double endBal = resultSet.getDouble(7);
            Transactions transactions1 = new Transactions(id, custId, acctId,startBal, withdrawl, deposit, endBal);
            transactions.add(transactions1);
            System.out.println(transactions1);
        }
        System.out.println("End of Transaction List");
        return transactions;
    }

    @Override
    public void logDeposit(int custID, int acctNum, double start, double deposit, double end) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "insert into transactions (Cust_ID, Acct_ID, start_bal, deposit, end_bal) values (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement1 = connection.prepareStatement(sql);
        preparedStatement1.setInt(1, custID);
        preparedStatement1.setInt(2, acctNum);
        preparedStatement1.setDouble(3, start);
        preparedStatement1.setDouble(4,deposit);
        preparedStatement1.setDouble(5, end);
        int count = preparedStatement1.executeUpdate();
        if (count > 0)
            System.out.println("Transaction Processing");
        else
            System.out.println("Oops! Something Went Wrong");
        String sql2 = "update accounts set balance = ? where Acct_Num = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql2);
        preparedStatement.setDouble(1, end);
        preparedStatement.setInt(2, acctNum);
        int count2 = preparedStatement.executeUpdate();
        if (count2>0)
        System.out.println("You have deposited $" +deposit +" into Account #" +acctNum +" New Balance is $" +end);
        else
            System.out.println("Oops Somethins Went Wrong");
    }

    @Override
    public void logWithdraw(int custID, int acctNum, double start, double withdraw, double end) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "insert into transactions (Cust_ID, Acct_ID, start_bal, withdraw, end_bal) values (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, custID);
        preparedStatement.setInt(2, acctNum);
        preparedStatement.setDouble(3, start);
        preparedStatement.setDouble(4,withdraw);
        preparedStatement.setDouble(5, end);
        String sql2 = "update accounts set balance = ? where Acct_Num = ?";
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Transaction Processing");
        else
            System.out.println("Oops! something went wrong");
        PreparedStatement preparedStatement1 = connection.prepareStatement(sql2);
        preparedStatement1.setDouble(1,end);
        preparedStatement1.setInt(2,acctNum);
        int count2 = preparedStatement1.executeUpdate();
        if (count2>0) {
            System.out.println("You have withdrawn $" + withdraw + " from Account #" + acctNum + " Remaining Balance is $" + end);
        } else {
            System.out.println("Oops! something went wrong");
        }
    }
}
