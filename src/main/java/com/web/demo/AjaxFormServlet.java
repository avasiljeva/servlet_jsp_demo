package com.web.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxFormServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	// all the following parameters are hardcoded here,
	// but in real application they may be retrieved from database
	
	private final List<String> accounts = Arrays.asList(new String[]{"111", "222", "333"});
	
	private final int MIN_AMOUNT = 10;
	private final int MAX_AMOUNT = 100;
	
	private final String SECRET_CODE = "fixed_code";	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException 
	{
		System.out.println("*** AjaxFormServlet GET processing started ***");
		
		String object = request.getParameter("object");
		String value = request.getParameter("value");
		System.out.println("Object=" + object + " Value=" + value);
		
		response.setContentType("text/xml");
		response.setHeader("Cache-Control", "no-cache");
		PrintWriter writer = response.getWriter();
		writer.write("<?xml version='1.0' encoding='UTF-8'?>");
		writer.write("<response>");
		writer.write("<object>" + object + "</object>");
		
		if ("account".equals(object)){
			if (value != null && accounts.contains(value)) {
				writer.write("<result>true</result>");
				writer.write("<message>Account OK</message>");
			}
			else{
				writer.write("<result>false</result>");
				writer.write("<message>Account is not recognized</message>");
			}
		}
		else if ("amount".equals(object)){
			if (value != null) {
				int amount = Integer.parseInt(value);
				if (amount >= MIN_AMOUNT && amount <= MAX_AMOUNT){
					writer.write("<result>true</result>");
					writer.write("<message>Amount OK</message>");
				}
				else{
					writer.write("<result>false</result>");
					writer.write("<message>Invalid amount. MIN: " + MIN_AMOUNT + " MAX: " + MAX_AMOUNT + "</message>");
				}				
			}
			else{
				writer.write("<result>false</result>");
				writer.write("<message>Invalid amount. MIN: " + MIN_AMOUNT + " MAX: " + MAX_AMOUNT + "</message>");
			}
		}
		else if ("code".equals(object)){
			if (SECRET_CODE.equals(value)) {
				writer.write("<result>true</result>");
				writer.write("<message>Secret Code OK</message>");
			}
			else{
				writer.write("<result>false</result>");
				writer.write("<message>Invalid Secret Code</message>");
			}
		}
		writer.write("</response>");
		
		System.out.println("*** AjaxFormServlet GET processing finished ***");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException 
	{
		System.out.println("*** AjaxFormServlet POST processing started ***");

		String account = request.getParameter("account");
		String amount = request.getParameter("amount");
		String code = request.getParameter("code");
		System.out.println("Account: " + account + " Amount: " + amount + " Code: " + code);
		// PROCESS FORM SUBMISSION
		System.out.println("*** Form successfully submitted ***");
		
		response.setContentType("text/plain");
		response.getWriter().write("Form successfully submitted!");
		
		System.out.println("*** AjaxFormServlet POST processing finished ***");
	}
}