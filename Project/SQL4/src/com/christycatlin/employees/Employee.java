package com.christycatlin.employees;

public class Employee {
    private double id;
    private String name;
    private String city;
    private double commission;

    public Employee(){

    }

    public Employee (double id, String name, String city, double commission){
        this.id = id;
        this.name = name;
        this.city = city;
        this.commission = commission;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString(){
        return "Salesman ID: " +
                id +", Name: " +
                name + ", City: " +
                city + ", Commission: " +
                commission;
    }
}
