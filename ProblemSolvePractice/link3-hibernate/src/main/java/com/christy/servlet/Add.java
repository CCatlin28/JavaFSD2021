package com.christy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.sql.SQLException;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.christy.object.Employee2;
import com.christy.object.PageInfo;



public class Add extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//set up response type so print will make web page
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// set up connection to sql
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//factory creation
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		
		//get info from web form
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");

		//create new employee
		Employee2 employee = new Employee2();
		employee.setName(name);
		employee.setEmail(email);
		employee.setGender(gender);
		employee.setCountry(country);
		
		//save the transaction
		session.save(employee);
		
		//commit the transaction
		t.commit();
	
		
		//input confirmation page code
		PageInfo page = new PageInfo();
		out.print(page.getTop());
		out.print("<title>Add Confirmation</title>");
		out.print(page.getViewNav());
		out.print("<h2>New Employee "+name+" Entered into Database</h2>");
		out.print(page.getViewTableTop());
		out.print(employee);
		out.print(page.getViewTableBottom());
		out.print(page.getBottom());
		
		//close the session
		session.close();

	}

}
