package com.christy;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
			
		String username = request.getParameter("username");
		String password = request.getParameter("password");
			
		if(username.equalsIgnoreCase("christy") && password.equals("123")) {
			request.getRequestDispatcher("navbar.html").include(request, response);
			out.println("You are successfully logged in!");
			out.println("<br>Welcome "+username);
			//create a HTTP Session
			HttpSession session = request.getSession();
			session.setAttribute("uname", username);
			
		}else if(username.equals("admin") && password.equals("789")) {
			request.getRequestDispatcher("navbar.html").include(request, response);
			out.println("You are successfully logged in!");
			out.println("<br>Welcome "+username);
			//create a HTTP Session
			HttpSession session = request.getSession();
			session.setAttribute("uname", username);

		}else {
			out.println("Sorry! Invalid Details");
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
		out.close();
			
		
	}

	
}

