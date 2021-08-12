package com.christycatlin.transactions;

public class Transactions {
    private int transactionId;
    private int custId;
    private int acctId;
    private double startBal;
    private double withdrawl;
    private double deposit;
    private double endBal;



    public Transactions(int transactionId, int custId, int acctId, double startBal, double withdrawl, double deposit, double endBal) {
        this.transactionId = transactionId;
        this.custId = custId;
        this.acctId = acctId;
        this.startBal = startBal;
        this.withdrawl = withdrawl;
        this.deposit = deposit;
        this. endBal =endBal;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public int getAcctId() {
        return acctId;
    }

    public void setAcctId(int acctId) {
        this.acctId = acctId;
    }


    @Override
    public String toString() {
        return "Transaction Number: " + transactionId + ", is associated with Account Number "
                + acctId + ", belonging to Customer ID: " + custId + " with a starting balance of $" + startBal
                + " a withdraw amount of $" + withdrawl + " a deposit amount of $" + deposit + " with an ending balance of $"
                + endBal;
    }
}
