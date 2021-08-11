package com.christycatlin.customer;

public class Customer {
    private int custID;
    private String name;
    private String surName;
    private String phone;
    private String email;
    private String pass;

//    public Customer(){
//    }
//
//    public Customer(String name, String surName, String phone, String email, String pass){
//        this.name = name;
//        this.surName = surName;
//        this.phone = phone;
//        this.email = email;
//        this.pass = pass;
//    }
//    public Customer(int custID, String name, String surName, String phone, String email, String pass){
//        this.custID = custID;
//        this.name = name;
//        this.surName = surName;
//        this.phone = phone;
//        this.email = email;
//        this.pass = pass;
//    }
//
//    public Customer(int custID){
//        this.custID = custID;
//
//    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    @Override
    public String toString(){
        return "Customer " + name + " " + surName
                + "has ID #" + custID + ". Their Contact information is "
                + phone + " for phone calls and " + email + " for emails";
    }
}
