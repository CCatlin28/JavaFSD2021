package com.christycatlin;

import com.christycatlin.transactions.Transactions;
import com.christycatlin.transactions.TransactionsDBImpl;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static junit.framework.Assert.assertFalse;

public class JUnit {

    @Test
   public void TestViewCustomer() throws SQLException {

    TransactionsDBImpl transactionsDB = new TransactionsDBImpl();
    List<Transactions> actualTransaction = transactionsDB.viewCust(1);
    assertFalse(actualTransaction.isEmpty());

}




}
