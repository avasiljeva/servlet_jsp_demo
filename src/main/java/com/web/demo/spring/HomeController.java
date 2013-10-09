package com.web.demo.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HomeController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		System.out.println("*** HomeController ***");
		System.out.println("Greeting message" + greeting);
		return new ModelAndView("home", "message", greeting);
	}

	private String greeting;

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}

