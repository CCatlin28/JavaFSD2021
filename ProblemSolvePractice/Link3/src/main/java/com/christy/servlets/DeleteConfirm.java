package com.christy.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.christy.connections.PageInfo;
import com.christy.employee.DaoEmployee;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteConfirm extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		PageInfo page = new PageInfo();

		
		
		try {
			DaoEmployee emp1 = new DaoEmployee();
			String idEmp = request.getParameter("id");
			int id = Integer.parseInt(idEmp);
			out.print(page.getUpdateCompleteTop());
			out.print(emp1.delete(id));
			out.print(page.getBottomUpdateComplete());
			
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
		}
		

	
		
		
	}


}
