package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.*;

public class WelcomeServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("username");
		out.println("Welcome " + name);
	}
	

}
