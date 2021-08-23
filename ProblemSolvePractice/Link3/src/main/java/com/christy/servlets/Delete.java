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

public class Delete extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		PageInfo page = new PageInfo();
		Employee oEmp = new Employee();
		int id = 0;
		
		try {
			DaoEmployee emp = new DaoEmployee();
			String idEmp = request.getParameter("select");
			id = Integer.parseInt(idEmp);
			out.print(page.getTopConfirm());
			out.print(emp.view(id));
			out.print(page.getBottomDelete());
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
			
		}
		
		
		
	}
	


}
