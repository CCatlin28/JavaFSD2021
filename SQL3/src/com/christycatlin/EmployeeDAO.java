package com.christycatlin;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
    void addEmployee(String name, String email) throws SQLException;
    void updateEmployee(Employee employee) throws SQLException;
    void deleteEmployee(int id) throws SQLException;
    List<Employee> getEmployees() throws SQLException;
    List<Employee> employeeById(int id) throws SQLException;
}
