package com.christycatlin.accounts;

public class AcctDBFactory {
    private static IAcctDB acct;
    private AcctDBFactory () {}
    public static IAcctDB getAcct(){
        if(acct == null)
            acct = new AcctDBImpl();
        return acct;
    }
}
