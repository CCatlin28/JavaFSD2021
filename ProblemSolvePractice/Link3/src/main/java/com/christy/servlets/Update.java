package com.christy.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.christy.connections.PageInfo;
import com.christy.employee.DaoEmployee;
import com.christy.employee.Employee;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Update extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		PageInfo page = new PageInfo();
		Employee oEmp = new Employee();
		int id = 0;
		String name = null;
		String email = null;
		String gender = null;
		String country = null;
		
		try {
			DaoEmployee emp = new DaoEmployee();
			String idEmp = request.getParameter("select");
			id = Integer.parseInt(idEmp);
			out.print(page.getTopConfirm());
			out.print(emp.view(id));
			name = request.getParameter("name");
			email = request.getParameter("email");
			gender = request.getParameter("gender");
			country = request.getParameter("country");
			out.print(page.getBottomUpdate());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		catch (NumberFormatException n) {
			String idEmp = request.getParameter("select");
			out.println(idEmp);
		} finally {
			oEmp.setId(id);
			oEmp.setName(name);
			oEmp.setEmail(email);
			oEmp.setGender(gender);
			oEmp.setCountry(country);
		}
		
		
		
	}
	

	
	

	
}
