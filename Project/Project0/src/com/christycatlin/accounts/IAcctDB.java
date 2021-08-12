package com.christycatlin.accounts;

import java.io.IOException;
import java.sql.SQLException;

public interface IAcctDB {
    void getAcct() throws SQLException;
    void getAcctByCustID(int custId) throws SQLException;
    void getAcctByAcctID(int custID, int acctId) throws  SQLException;
    void withdraw(int id, int acctId, double withdrawAmt) throws SQLException;
    void deposit(int id, int acctId, double depositAmt) throws SQLException;
    void createAcct(int custID, String type, double balance) throws SQLException, IOException;
}
