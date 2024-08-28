package com.company.backend;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/quest1") // these are mapping from itself 
public class quest1 implements Servlet {
	
	private ServletConfig servletConfig;

	// life cycle methods

	@Override
	public void init(ServletConfig arg0) throws ServletException {
	    this.servletConfig=arg0;
		System.out.println("initializing servlet");
		
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		
		System.out.println("service request");		
	}
		
	@Override
	public void destroy() {
		 
		System.out.println("destroying servlet");
		
	}

	// non life cycle methods
	@Override
	public ServletConfig getServletConfig() {
		return this.servletConfig;
	}

	@Override
	public String getServletInfo() { // apne servlet ki information likhni hai
		
		return "This servlet is created by Aman kumar kunwar";
	}

	

}
