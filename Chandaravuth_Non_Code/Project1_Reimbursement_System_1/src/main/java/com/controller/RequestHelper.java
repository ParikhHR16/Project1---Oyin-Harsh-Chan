package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.LoginController;

public class RequestHelper {
	public static String process(HttpServletRequest request, HttpServletResponse response) {
		
		switch(request.getRequestURI()) {
		
		case "/Project1_Reimbursement_System_1/html/Login.do":
			return LoginController.Login(request);
			
			
		default:
			return "/html/Login.html";
		}
		
	}

}
