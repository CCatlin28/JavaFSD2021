package com.christy;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><style>\r\n"
				+ "    @import url('https://fonts.googleapis.com/css2?family=Playfair+Display:ital@1&display=swap');\r\n"
				+ "        \r\n"
				+ "	.wrapper{\r\n"
				+ "		width: 40%;\r\n"
				+ "		border: 1px solid #666;\r\n"
				+ "		margin: 0 auto;\r\n"
				+ "		padding: 20px;\r\n"
				+ "		background-color: lightskyblue;text-align: center;\r\n"
				+ "	}\r\n"
				+ "    h1{\r\n"
				+ "        font-family: 'Playfair Display', serif, bold;\r\n"
				+ "            text-align: center;\r\n"
				+ "\r\n"
				+ "    }\r\n"
				+ "    table{\r\n"
				+ "        font-family: 'Times New Roman', Times, serif, bold;\r\n"
				+ "    }</style><body>");
		
		out.println("<h1>Welcome to Calculator Servlet</h1>");
		out.print("<div class=\"wrapper\">\r\n"
				+ "        <h1>Calculator Answer</h1>");
		double num1 = Double.parseDouble(request.getParameter("first_number"));
		double num2 = Double.parseDouble(request.getParameter("second_number"));
		String function = request.getParameter("function");
		
		if(function.equals("addition")) {
				double ans1 = num1+num2;
				out.println(num1 +" + "+ num2 + " = " + ans1);
		} else if (function.equals("subtraction")) {
				double ans2 = num1-num2;
				out.println(num1 +" - "+ num2 + " = " + ans2);
		} else if (function.equals("multiplication")) {
				double ans3 = num1*num2;
				out.println(num1 +" x "+ num2 + " = " + ans3);
		} else if (function.equals("division")) {
				double ans4 = num1/num2;
				out.println(num1 +" / "+ num2 + " = " + ans4);
		} else {
				out.println("invalid input");
		
		}
		out.print(" </div>");
		out.print("</body></html>");
		
	}
	

}
