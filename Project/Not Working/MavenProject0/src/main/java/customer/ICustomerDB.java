package customer;

import java.sql.SQLException;


public interface ICustomerDB {
    void custLogin(int id, String pass) throws SQLException;
    void newAcct() throws SQLException;
    void startTransfer(int custID) throws SQLException;
    void acceptTransfer ( int custID, int acctId, int custId2, int acctID2, double transfer) throws SQLException;
    void newCust(String name, String surName, String phone, String email,String password) throws SQLException;
    void getCust() throws SQLException;
}
