package com.christy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.christy.object.Employee2;
import com.christy.object.PageInfo;

public class Update extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//set up response type so print will make web page
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		PageInfo page = new PageInfo();
		// set up connection to sql
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//factory creation
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
	
		//get id from web form
		String idEmp = request.getParameter("select");
		int id = Integer.parseInt(idEmp);
		Employee2 emp = session.get(Employee2.class, id);
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		
		
		//print out confirmation page
		out.print(page.getTop());
		out.print("<title>Update Employees</title>");
		out.print(page.getViewNav());
		out.print("<h1> Update Employee</h1>");
		
		//set up more like the add table
		//out.print(emp);
		
		out.print(page.getUpdateTable(name, email, gender, country));
		out.print(page.getUpdateBottom());
		out.print(page.getBottom());
	}

}
