package com.christycatlin.orders;

import java.util.Date;

public class Orders {
    private double ordNum;
    private double purchAmt;
    private Date date;
    private double custID;
    private double salesID;

    public Orders(){

    }

    public Orders(double ordNum, double purchAmt,
                  Date date, double custID, double salesID){
        this.ordNum = ordNum;
        this.purchAmt = purchAmt;
        this.date = date;
        this.custID = custID;
        this.salesID = salesID;
    }

    public double getOrdNum() {
        return ordNum;
    }

    public void setOrdNum(double ordNum) {
        this.ordNum = ordNum;
    }

    public double getPurchAmt() {
        return purchAmt;
    }

    public void setPurchAmt(double purchAmt) {
        this.purchAmt = purchAmt;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getCustID() {
        return custID;
    }

    public void setCustID(double custID) {
        this.custID = custID;
    }

    public double getSalesID() {
        return salesID;
    }

    public void setSalesID(double salesID) {
        this.salesID = salesID;
    }

    @Override
    public String toString(){
        return "Order Number: " + ordNum
                + " for $" + purchAmt +
                " on " + date + " by Customer with ID of "
                +custID + " is credited to Sales Associate ID: " + salesID;
    }
}
