package com.christycatlin.accounts;

import java.sql.SQLException;
import java.util.List;

public interface IAcctDB {
    List<Accounts> getAcct() throws SQLException;
    List<Accounts> getAcctByCustID(int custId) throws SQLException;
    List<Accounts> getAcctByAcctID(int acctId) throws  SQLException;
    void withdraw(int acctId, double withdrawAmt) throws SQLException;
    void deposit(int acctId, double depositAmt) throws SQLException;

}
