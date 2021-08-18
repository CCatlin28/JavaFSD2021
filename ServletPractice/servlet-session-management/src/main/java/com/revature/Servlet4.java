package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.*;

public class Servlet4 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//getting the value from query string
		String name = request.getParameter("name");
		out.print("Welcome "+name);
		out.close();
	}

}
