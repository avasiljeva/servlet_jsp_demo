package com.web.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletIncludeParent extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{		
		System.out.println("*** ServletIncludeParent ***");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>This is starting line printed by parent servlet<br/>");
		RequestDispatcher dispatcher = request.getRequestDispatcher("servlet_include_child");
		dispatcher.include(request, response);
		out.println("<body>This is ending line printed by parent servlet<br/>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
