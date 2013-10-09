package com.web.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class DemoServlet2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("*** DemoServlet2 ***");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>" +
				"Hello DemoServlet2!<h1></body></html>");
		out.close();
	}


}
