package com.dao;
import com.model.ExpenseTicket;

public interface ExpenseTicketDao {
	
	// CREATE 
	public void insertExpenseTicket(ExpenseTicket exp);
	
	//READ
	public ExpenseTicket selectExpenseTicket(String name);
	
	// UPDATE
	public void updateExpenseTicket(ExpenseTicket exp);
	
	//DELETE
	public void deleteExpenseTicket(ExpenseTicket exp);
	
}
