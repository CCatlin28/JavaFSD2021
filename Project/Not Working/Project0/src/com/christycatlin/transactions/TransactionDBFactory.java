package com.christycatlin.transactions;

public class TransactionDBFactory {
    private static ITransactionDB log;
    private TransactionDBFactory(){}
    public static ITransactionDB getLog(){
        if (log == null)
            log = new TransactionsDBImpl();
        return log;
    }
}
