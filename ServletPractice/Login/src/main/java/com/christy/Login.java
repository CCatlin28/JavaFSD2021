package com.christy;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("navbarloggedout.html").include(request, response);
			
		String username = request.getParameter("username");
		String password = request.getParameter("password");
			
		if(username.equalsIgnoreCase("christy") && password.equals("123")) {
			out.println("You are successfully logged in!");
			out.println("<br>Welcome "+username);
			//create a cookie
			Cookie c = new Cookie("user_name", username);
			response.addCookie(c);
			RequestDispatcher nav = request.getRequestDispatcher("navbarloggedin.html");
			RequestDispatcher rd = request.getRequestDispatcher("/Profile.html");
			rd.include(request, response);
		}else if(username.equals("admin") && password.equals("789")) {
			out.println("You are successfully logged in!");
			out.println("<br>Welcome "+username);
			//create a cookie
			Cookie c = new Cookie("user_name", username);
			response.addCookie(c);
			RequestDispatcher nav = request.getRequestDispatcher("navbarloggedin.html");
			RequestDispatcher rd = request.getRequestDispatcher("/newprofile.html");
			rd.include(request, response);
		}else {
			out.println("Sorry! Invalid Details");
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
		out.close();
			
		
	}

}
