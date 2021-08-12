package com.christycatlin.employees;

import com.christycatlin.employees.Employee;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeDatabase {
    void addEmployee (double id, String name, String city, double commission) throws SQLException;
    void updateEmployee(Employee employee) throws SQLException;
    void deleteEmplyee(int id) throws SQLException;
    List<Employee> getEmployees() throws SQLException;
    List<Employee> employeeByID(int id) throws SQLException;
}
