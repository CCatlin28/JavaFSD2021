package com.christycatlin.transactions;

public class Transactions {
    private int transactionId;
    private int custId;
    private int acctId;
    private double startBal;
    private double withdrawl;
    private double deposit;
    private double endBal;

    public Transactions(){

    }
    public Transactions(int transactionId, int custId, int acctId, double startBal, double withdrawl, double deposit, double endBal){

    }

    public Transactions(int transactionId){
        this.transactionId = transactionId;
    }

    public Transactions(int custId, int acctId){
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

    //do I need a toString overide here?
}
