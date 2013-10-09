package com.web.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletIncludeChild extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{		
		System.out.println("*** ServletIncludeChild ***");
		
		PrintWriter out = response.getWriter();
		out.println("<body>This is middle line printed by child servlet<br/>");
	}
}
