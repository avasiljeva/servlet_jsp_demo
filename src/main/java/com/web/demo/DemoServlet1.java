package com.web.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet1 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException 
	{
		System.out.println("*** DemoServlet1 ***");
		
		PrintWriter out = response.getWriter();
		out.println("Hello from DemoServlet1!");
		out.close();
	}
}
