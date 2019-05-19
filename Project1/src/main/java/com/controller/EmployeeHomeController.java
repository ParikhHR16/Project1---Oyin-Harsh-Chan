package com.controller;

import javax.servlet.http.HttpServletRequest;

import com.dao.ExpenseTicketDaoImpl;
import com.model.ExpenseTicket;

public class EmployeeHomeController {
	
	public static String EmployeeJSON(HttpServletRequest request)
	{
		String  expenseType = request.getParameter("type");
		String amount = request.getParameter("Amount");
		String descrip = request.getParameter("Description");
		
		
		
		ExpenseTicketDaoImpl expImpl = new ExpenseTicketDaoImpl();
		ExpenseTicket expTicket = new ExpenseTicket();
		
		expTicket.setId_employee(LoginController.employeeId);
		expTicket.setReq_e_t(Integer.parseInt(expenseType));
		expTicket.setAmount_e_t(Double.parseDouble(amount));
		expTicket.setDescription_e_t(descrip);
		expTicket.setSub_date_e_t("2018-04-01");
		expTicket.setRes_date_e_t("2019-01-09");
		expTicket.setStatus_e_t(3);
		expTicket.setType_e_t(5);
		
		
		
		
		expImpl.insertExpenseTicket(expTicket);
		
		
		return "/html/Login.html";
	}
	
}
