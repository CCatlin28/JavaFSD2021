package com.christycatlin.employee;

public class Employee {
    private int empId;
    private String name;
    private String surName;
    private String phone;
    private String email;
    private String pass;

    public Employee(){

    }

    public Employee(String name, String surName, String phone, String email, String pass){
        this.name = name;
        this.surName = surName;
        this.phone = phone;
        this.email = email;
        this.pass = pass;
    }
    public Employee(int empId, String name, String surName, String phone, String email, String pass){
        this.empId = empId;
        this.name = name;
        this.surName = surName;
        this.phone = phone;
        this.email = email;
        this.pass = pass;
    }

    public Employee(int empId){
        this.empId = empId;

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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
        return "Employee " + name + " " + surName
                + "has ID #" + empId + ". Their Contact information is "
                + phone + " for phone calls and " + email + " for emails";
    }
}
