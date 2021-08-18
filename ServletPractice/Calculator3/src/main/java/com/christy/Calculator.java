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
		out.println("<h1>Welcome to Calculator Servlet</h1>");
		
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
		
	}

}
