package com.christy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.christy.object.Employee2;
import com.christy.object.PageInfo;

public class View extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//set up 
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
		
		//print top of page
		out.print(page.getTop());
		out.print("<title>View All Employees</title>");
		out.print(page.getAddNav());
		out.print("<h1> Employee Database</h1>");
		out.print(page.getViewTableTop());
		
		//pull info from sql and print
		for (int i =0; i<100;i++) {
			 Employee2 emp = session.get(Employee2.class, i);
		     //   int id = emp.getId();
//		        String name = emp.getName();
		        if(emp !=null) {
		        	out.print(emp);
//		        	
		        } else {
		        	continue;
		        }
		}
		 
		
		//print bottom of page
		out.print(page.getViewTableBottom());
		out.print(page.getBottom());
	}

}
