package com.christycatlin.transactions;

import java.sql.SQLException;
import java.util.List;

public interface ITransactionDB {
    List<Transactions> viewAll() throws SQLException;
    public List<Transactions> viewCust(int custID) throws SQLException;
    public List<Transactions> viewAcct(int acctNum) throws SQLException;

}
