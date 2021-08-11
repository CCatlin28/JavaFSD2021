package com.christycatlin.employee;

public class Employee {
    private int empId;
    private String name;
    private String surName;
    private String phone;
    private String email;
    private String pass;


    @Override
    public String toString(){
        return "Employee " + name + " " + surName
                + "has ID #" + empId + ". Their Contact information is "
                + phone + " for phone calls and " + email + " for emails";
    }
}
