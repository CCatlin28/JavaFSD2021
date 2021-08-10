package com.christycatlin.transactions;

public class Transactions {
    private int transactionId;
    private int custId;
    private int acctId;
    private double startBal;
    private double withdrawl;
    private double deposit;
    private double endBal;

    public Transactions() {

    }

    public Transactions(int transactionId, int custId, int acctId, double startBal, double withdrawl, double deposit, double endBal) {
        this.transactionId = transactionId;
        this.custId = custId;
        this.acctId = acctId;
        this.startBal = startBal;
        this.withdrawl = withdrawl;
        this.deposit = deposit;
        this. endBal =endBal;

    }

    public Transactions(int transactionId) {
        this.transactionId = transactionId;
    }

    public Transactions(int custId, int acctId) {
        this.custId = custId;
        this.acctId = acctId;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
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

    public double getStartBal() {
        return startBal;
    }

    public void setStartBal(double startBal) {
        this.startBal = startBal;
    }

    public double getWithdrawl() {
        return withdrawl;
    }

    public void setWithdrawl(double withdrawl) {
        this.withdrawl = withdrawl;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getEndBal() {
        return endBal;
    }

    public void setEndBal(double endBal) {
        this.endBal = endBal;
    }

    @Override
    public String toString() {
        return "Transaction Number: " + transactionId + ", is associated with Account Number "
                + acctId + ", belonging to Customer ID: " + custId + " with a starting balance of $" + startBal
                + " a withdraw amount of $" + withdrawl + " a deposit amount of $" + deposit + " with an ending balance of $"
                + endBal;
    }
}
