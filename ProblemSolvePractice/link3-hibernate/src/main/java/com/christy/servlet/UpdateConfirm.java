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

public class UpdateConfirm extends HttpServlet {
	
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
	
		
		//get id from web form
		String idEmp = request.getParameter("select");
		int id = Integer.parseInt(idEmp);
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		
		//update info
		Employee2 employee = session.get(Employee2.class, id);
		session.update(name, employee);
		
		
	}

}
