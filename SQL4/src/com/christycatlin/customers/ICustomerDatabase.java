package com.christycatlin.customers;

import com.christycatlin.customers.Customer;
import com.christycatlin.employees.Employee;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerDatabase {
    void addCustomer(double ID, String cName, String city, double grade, double salesID) throws SQLException;
    void updateCustomer(Employee employee) throws SQLException;
    void deleteCustomer(double id) throws SQLException;
    List<Customer> getCustomers () throws SQLException;
    List<Customer> customerByID (double id) throws SQLException;
}
