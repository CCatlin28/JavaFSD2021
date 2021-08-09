package com.christycatlin.customers;

public class Customer {
    private double id;
    private String name;
    private String city;
    private double grade;
    private double saleId;

    public Customer(){

    }

    public Customer(double id, String name, String city, double grade, double saleId){
        this.id = id;
        this.name = name;
        this.city = city;
        this.grade = grade;
        this.saleId = saleId;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getSaleId() {
        return saleId;
    }

    public void setSaleId(double saleId) {
        this.saleId = saleId;
    }

    @Override
    public String toString(){
        return "Customer ID: " + id
                + ", Name: " + name
                + ", City: " + city
                + ", Grade: " + grade
                + "Salesman ID: " + saleId;
    }
}
