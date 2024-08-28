package com.company.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class ThirdWay extends HttpServlet {
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("processing request by do get method");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String mssg = req.getParameter("message");
	//	PrintWriter out = resp.getWriter();
	//	out.println(mssg);
		System.out.println(mssg);
		System.out.println("form submitted using  dopost method");
		
		
		
		// sending data to browser
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Form submitted</h1>");
		
	}
	
	
	

}
