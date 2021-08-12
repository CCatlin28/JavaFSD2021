package com.christycatlin.employees;

import com.christycatlin.connections.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class EmployeeImplementation implements IEmployeeDatabase{

    private static Statement statement = null;
    Connection connection = null;

   public EmployeeImplementation(){
       try {
           this.connection = ConnectionFactory.getConnection();
       } catch (SQLException throwables) {
           throwables.printStackTrace();
       }
   }



    @Override
    public void addEmployee(double id, String name, String city, double commission) throws SQLException {
        String sql = "insert into salesman (salesman_id, name, city, commission) values (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setDouble(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3, city);
        preparedStatement.setDouble(4, commission);
        int count = preparedStatement.executeUpdate();
        if(count>0)
            System.out.println("Employee Saved");
        else
            System.out.println("Oops! Something went wrong");
    }

    @Override
    public void updateEmployee(Employee employee) throws SQLException {

    }

    @Override
    public void deleteEmplyee(int id) throws SQLException {

    }

    @Override
    public List<Employee> getEmployees() throws SQLException {
        return null;
    }

    @Override
    public List<Employee> employeeByID(int id) throws SQLException {
        return null;
    }
}
