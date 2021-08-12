package com.christycatlin.customer;

import java.io.IOException;
import java.sql.SQLException;


public interface ICustomerDB {
    boolean custLogin(int id, String pass) throws SQLException, IOException;
    void newAcct() throws SQLException, IOException;
    void startTransfer(int custID) throws SQLException;
    void acceptTransfer ( int custID, int acctId, int custId2, int acctID2, double transfer) throws SQLException;
    void newCust(String name, String surName, String phone, String email,String password) throws SQLException, IOException;
    void getCust() throws SQLException;
}
