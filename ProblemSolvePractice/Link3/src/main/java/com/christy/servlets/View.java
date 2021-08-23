package com.christy.servlets;

import java.io.IOException; 
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.christy.connections.*;
import com.christy.employee.DaoEmployee;

import jakarta.servlet.http.*;

public class View extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		PageInfo page = new PageInfo();
		
		try {
			DaoEmployee emp = new DaoEmployee();
			out.print(page.getTopView());
			out.print(emp.viewAll());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException c) {
		// TODO Auto-generated catch block
		c.printStackTrace();
	}
		out.print(page.getBottomView());
		
	}
}
