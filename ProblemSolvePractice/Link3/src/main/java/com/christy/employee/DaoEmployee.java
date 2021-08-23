package com.christy.employee;


import com.christy.connections.*;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoEmployee implements IDaoEmployee {
	
	private static Statement statement = null;
    Connection connection = null;
    PageInfo page = new PageInfo();


    public DaoEmployee() throws ClassNotFoundException {
    	try {
    		this.connection = ConnectionFactory.getConnection();
    	} catch (SQLException throwables) {
    		throwables.printStackTrace();
    	}
    }
    

	@Override
	public String viewAll() throws SQLException {
        String sql = "select * from employee";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        String viewEmployee = "";
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);
            String gender = resultSet.getString(4);
            String country = resultSet.getString(5);
          viewEmployee += "<tr>\r\n"
	        		+ "                <th scope=\"row\">"+id+"</th>\r\n"
	        		+ "                <td>"+name+"</td>\r\n"
	        		+ "                <td>"+email+"</td>\r\n"
	        		+ "                <td>"+gender+"</td>\r\n"
	        		+ "                <td>"+country+"</td>\r\n"
	        		+ "                <td><input type=\"radio\"  name=\"select\" id=\"select\" value="+id+" ></td>\r\n"
	        		+ "              </tr>";
        }
        return viewEmployee;
        
    }

	@Override
	public String view(int id) throws SQLException{
        String sql = "select * from employee where id =" + id;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        String viewEmployee = "";
        while (resultSet.next()){
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);
            String gender = resultSet.getString(4);
            String country = resultSet.getString(5);
            viewEmployee = "<div class=\"form-group\">\r\n"
            		+ "            		<input type=\"hidden\" name=\"id\" value="+id+">\r\n"
            		+ "            		</div>\r\n"
            		+ "                <div class=\"form-group\">\r\n"
            		+ "                    <label>Name</label>\r\n"
            		+ "                    <input type=\"text\" class=\"form-control\" name=\"name\" value="+name+">\r\n"
            		+ "                  </div>\r\n"
            		+ "                  <div class=\"form-group\">\r\n"
            		+ "                    <label>Email address</label>\r\n"
            		+ "                    <input type=\"email\" class=\"form-control\" name=\"email\" value="+email+">\r\n"
            		+ "                  </div>\r\n"
            		+ "                  <div class=\"form-group\">\r\n"
            		+ "            		<label>Gender</label>\r\n"
            		+ "            		<input type=\"text\" class=\"form-control\" name=\"gender\" value="+gender+">\r\n"
            		+ "            		</div>\r\n"
            		+ "            		<div class=\"form-group\">\r\n"
            		+ "            		<label>Country</label>\r\n"
            		+ "            		<input type=\"country\"class=\"form-control\" name=\"country\" value="+country+">\r\n"
            		+ "            		</div>\r\n";
            
        }
        return viewEmployee;
	}

	@Override
	public String add(String name, String email, String gender, String country) throws SQLException{
		
		String sql = "insert into employee (name, email, gender, country) values (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, email);
        preparedStatement.setString(3, gender);
        preparedStatement.setString(4, country);
        int count = preparedStatement.executeUpdate();
        //add html for confirmation page
       
        if (count > 0) {
        	String empAdd = page.getTopMessage() +"<h1>New Employee Input</h1>"+ page.getBottomMessage();
        	return empAdd;
        } else {
        	// add html for fail page
        	String empNotAdd = page.getTopMessage()+"<h1>New Employee Input Failed</h1>"+page.getBottomMessage();
        	return empNotAdd;
        }
       

	}

	@Override
	public String update(int id, String name, String email, String gender, String country) throws SQLException{
		String employee = null;
		String sql = "update employee set name = ?, email = ?, gender = ?, Country = ? where id =" +id;
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, email);
        preparedStatement.setString(3, gender);
        preparedStatement.setString(4, country);
        int count = preparedStatement.executeUpdate();
        //add html for confirmation page
        if (count > 0) {
        	employee = "<h1>Employee: "+id+": "+name+ " Updated</h1>";
        	
        } else {
        	// add html for fail page
        	employee = "<h1>Employee: "+id+": "+name+" Update Failed</h1>";
        	
        }
        return employee;

	}

	@Override
	public String delete(int id) throws SQLException{
		String employee = null;
		String sql = "delete from employee where id =" +id;
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        int count = preparedStatement.executeUpdate();
        //add html for confirmation page
        if (count > 0) {
        	employee = "<h1>Employee: "+id+" Removed</h1>";

        } else {
        	// add html for fail page
        	employee = "<h1>Employee: "+id+" Removal Failed</h1>";
      
        }
        return employee;

	}

}
