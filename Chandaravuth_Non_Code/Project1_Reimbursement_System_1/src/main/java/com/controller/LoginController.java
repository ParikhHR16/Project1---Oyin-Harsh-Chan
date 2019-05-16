package com.controller;

import javax.servlet.http.HttpServletRequest;

import com.dao.EmployeeDaoImpl;
import com.model.Employee;

public class LoginController {
	public static String Login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        EmployeeDaoImpl empImpl = new EmployeeDaoImpl();
        Employee emp = new Employee();
        emp = empImpl.selectEmployee(username, password);
        
		if(emp==(null))
		{
			
			return "/html/Login.html";
			
		}
		else if(username.equals(emp.getUsername()) && password.equals(emp.getPassword()))
		{
			if("admin".equals(emp.getPosition()))
			{
				return "/html/AdminHome.html";
			}
			if("employee".equals(emp.getPosition()))
			{
				return "/html/EmployeeHome.html";
			}
			
		}
		
			return "/html/Login.html";
		
        
	}
}
