package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.*;

public class Servlet5 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		out.print("Welcome " + name);
		
		HttpSession session = request.getSession();
		session.setAttribute("uname", name);
		
		out.println("<a href='Servlet6'>Click Here</a>");
		
		out.close();
	}

}
