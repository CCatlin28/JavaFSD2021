package com.christycatlin.transactions;

import com.christycatlin.connections.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    public List<Transactions> viewAll() throws SQLException {
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

        }
        return transactions;
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

        }
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

        }
        return transactions;

    }
}
