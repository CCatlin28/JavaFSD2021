package com.christycatlin.employees;

public class EmployeeDataFactory {
    private static IEmployeeDatabase emp;
    private EmployeeDataFactory(){}
    public static IEmployeeDatabase getEmp(){
        if (emp == null)
            emp = new EmployeeImplementation();
        return emp;
    }
}
