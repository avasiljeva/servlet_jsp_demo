package com.web.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletForward extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{		
		System.out.println("*** ServletForward ***");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("servlet2");
		dispatcher.forward(request, response);		
	}
}
