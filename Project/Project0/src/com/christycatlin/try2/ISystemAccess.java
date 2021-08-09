package com.christycatlin.try2;

import java.sql.SQLException;

public interface ISystemAccess {
    boolean loginEmployee(int id, String pass) throws SQLException;
    boolean loginCustomer(int id, String pass) throws SQLException;
    void addCustomer(String firstName, String lastName, String phone, String email, String pass) throws SQLException;
    void addAccount(accountType account, int custId, int bal);
    void viewCustomer(String firstName, String lastName, String phone, String email, String pass) throws SQLException;
}
enum accountType{
    Checking,
    Savings
}
