package com.web.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("*** LoginServlet ***");
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		System.out.println("Login: " + login);
		System.out.println("Password: " + password);
		
		// check login and password
		String isValid = getServletConfig().getInitParameter("isValid");
		if ((new Boolean(isValid).booleanValue())){
			response.sendRedirect(request.getContextPath() + "/login_ok.html");
		}
		else{
			response.sendRedirect(request.getContextPath() + "/login_failed.html");
		}
			
	}


}
