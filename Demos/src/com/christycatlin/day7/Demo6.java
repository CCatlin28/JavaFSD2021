package com.christycatlin.day7;

class Employee{

    String name;

    public <T> Employee(T name){
        this.name = name.toString();
    }
}

public class Demo6 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Mark");
        Employee emp2 = new Employee(123);

        System.out.println(emp1.name);
        System.out.println(emp2.name);
    }
}
