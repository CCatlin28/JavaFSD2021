package com.christycatlin.try2;

import com.christycatlin.connections.ConnectionFactory;

import java.sql.*;
import java.util.HashMap;

public class SystemAccessImplement implements ISystemAccess{
    private static Statement statement = null;
    Connection connection = null;
    private Object HashMap;

    public SystemAccessImplement(){
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    @Override
    public boolean loginEmployee(int id, String pass) throws SQLException {
        HashMap login = new HashMap();
        Bank bank = new Bank();
        String sql = "select Emp_Id, password from employee where Emp_id = " + id;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {
            id = resultSet.getInt(1);
            String password = resultSet.getString(2);
            login.put(id, password);
        } else {
            System.out.println("No Record Found");
        }
       if (login.containsValue(pass)){
           System.out.println("**** Login Successful ****");
           // add a link to Employee Class for Employee Functions
           return true;
       } else {
           System.out.println("*** Password incorrect ***");
           Bank.welcomeScreen();
           return false;
       }


    }

    @Override
    public boolean loginCustomer(int id, String pass) throws SQLException {
        HashMap login = new HashMap();
        Bank bank = new Bank();
        String sql = "select Cust_Id, password from customer where Cust_id = " + id;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {
            id = resultSet.getInt(1);
            String password = resultSet.getString(2);
            login.put(id, password);
        } else {
            System.out.println("No Record Found");
        }
        if (login.containsValue(pass)){
            System.out.println("**** Login Successful ****");
            // add a link to Customer Class for Customer Functions
            return true;
        } else {
            System.out.println("*** Password incorrect ***");
            Bank.welcomeScreen();
            return false;
        }

    }

    @Override
    public void addCustomer(String firstName, String lastName, String phone, String email, String pass) throws SQLException {
        String sql = "insert into customer (first_name, last_name, phone, email, password) values (?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, firstName);
        preparedStatement.setString(2, lastName);
        preparedStatement.setString(3, phone);
        preparedStatement.setString(4, email);
        preparedStatement.setString(5, pass);
        int count = preparedStatement.executeUpdate();
        if(count>0) {
            System.out.println("Customer Information Saved");
            viewCustomer(firstName,lastName,phone,email,pass);

        //        addAccount();

            } else {
                System.out.println("No Record Found");
            }
        }



    @Override
    public void addAccount(accountType account, int custId, int bal) {

    }

    @Override
    public void viewCustomer(String firstName, String lastName, String phone, String email, String pass) throws SQLException {

    }
}
