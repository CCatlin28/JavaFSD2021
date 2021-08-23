package com.christy;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Profile extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
		HttpSession session = request.getSession(false);
		String name = (String)session.getAttribute("uname");
				switch(name) {
				case "christy":
					request.getRequestDispatcher("/christy.html").include(request, response);
					break;
				case "admin":
					request.getRequestDispatcher("/admin.html").include(request, response);	
					break;
			default:
			out.println("Please go to login page and login first!");
			request.getRequestDispatcher("/login.html").include(request, response);
		}
		} catch (NullPointerException e){
			out.println("Please go to login page and login first!");
			request.getRequestDispatcher("/login.html").include(request, response);
		}
			out.close();
		
		
	}


}
