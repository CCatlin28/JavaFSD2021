package com.christycatlin.employee;

public class EmployeeDBFactory {
    private static IEmployeeDB empDB;
    private EmployeeDBFactory(){}
    public static IEmployeeDB getEmpDB(){
        if(empDB==null)
            empDB = new EmployeeDBImpl();
        return empDB;
    }
}
