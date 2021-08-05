package com.christycatlin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{

    private static Statement statement = null;
    Connection connection = null;
    private Object List;
    private Object Employee;

    public EmployeeDAOImpl(){
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    @Override
    public void addEmployee(String n, String e) throws SQLException {
        String sql = "insert into employee (name, email) values (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, n);
        preparedStatement.setString(2, e);
        int count = preparedStatement.executeUpdate();
        if(count>0)
            System.out.println("employee saved");
        else
            System.out.println("Oops! Something went wrong");
    }

    @Override
    public void updateEmployee(Employee employee) throws SQLException {
        String sql = "update employee set name = ?, email = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getEmail());
        preparedStatement.setInt(3, employee.getId());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("employee updated");
        else
            System.out.println("Oops! something went wrong");
    }

    @Override
    public void deleteEmployee(int id) throws SQLException {
        String sql = "delete from employee where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int count = preparedStatement.executeUpdate();
        if (count>0)
            System.out.println("employee deleted");
        else
            System.out.println("Oops! something went wrong");
    }

    @Override
    public List<Employee> employeeById(int empId) throws SQLException {
        List<Employee> employees = new ArrayList<>();
        String sql = "select * from employee where id = " + empId;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);
            com.christycatlin.Employee employee = new Employee(id, name,email);
            employees.add(employee);

        } else {
            System.out.println("No Record Found");
        }
        return employees;

    }

    @Override
    public List<Employee> getEmployees() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        String sql = "select * from employee";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);
            com.christycatlin.Employee employee = new Employee(id, name,email);
            employees.add(employee);

        }
        return employees;
        
    }


    }

