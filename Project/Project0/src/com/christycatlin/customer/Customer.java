package com.christycatlin.customer;

public class Customer {
    private int custID;
    private String name;
    private String surName;
    private String phone;
    private String email;
    private String pass;

    public Customer(){

    }

    public Customer(String name, String surName, String phone, String email, String pass){
        this.name = name;
        this.surName = surName;
        this.phone = phone;
        this.email = email;
        this.pass = pass;
    }
    public Customer(int custID, String name, String surName, String phone, String email, String pass){
        this.custID = custID;
        this.name = name;
        this.surName = surName;
        this.phone = phone;
        this.email = email;
        this.pass = pass;
    }

    public Customer(int custID){
        this.custID = custID;

    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString(){
        return "Customer " + name + " " + surName
                + "has ID #" + custID + ". Their Contact information is "
                + phone + " for phone calls and " + email + " for emails";
    }
}
