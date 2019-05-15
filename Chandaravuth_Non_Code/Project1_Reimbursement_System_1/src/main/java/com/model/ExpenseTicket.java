package com.model;

public class ExpenseTicket {
	private int id_expense_ticket;
	private int id_req_type;
	private int id_employee;
	private String ticket_description;
	private String ticket_status;
	private String sub_date;
	private String res_date;
	private double exp_amount;
	
	public ExpenseTicket() {
		
	}
	
	

	public ExpenseTicket(int id_expense_ticket, int id_req_type, int id_employee, String ticket_description,
			String ticket_status, String sub_date, String res_date, double exp_amount) {
		super();
		this.id_expense_ticket = id_expense_ticket;
		this.id_req_type = id_req_type;
		this.id_employee = id_employee;
		this.ticket_description = ticket_description;
		this.ticket_status = ticket_status;
		this.sub_date = sub_date;
		this.res_date = res_date;
		this.exp_amount = exp_amount;
	}



	public int getId_expense_ticket() {
		return id_expense_ticket;
	}

	public void setId_expense_ticket(int id_expense_ticket) {
		this.id_expense_ticket = id_expense_ticket;
	}

	public int getId_req_type() {
		return id_req_type;
	}

	public void setId_req_type(int id_req_type) {
		this.id_req_type = id_req_type;
	}

	public int getId_employee() {
		return id_employee;
	}

	public void setId_employee(int id_employee) {
		this.id_employee = id_employee;
	}

	public String getTicket_description() {
		return ticket_description;
	}

	public void setTicket_description(String ticket_description) {
		this.ticket_description = ticket_description;
	}

	public String getTicket_status() {
		return ticket_status;
	}

	public void setTicket_status(String ticket_status) {
		this.ticket_status = ticket_status;
	}

	public String getSub_date() {
		return sub_date;
	}

	public void setSub_date(String sub_date) {
		this.sub_date = sub_date;
	}

	public String getRes_date() {
		return res_date;
	}

	public void setRes_date(String res_date) {
		this.res_date = res_date;
	}

	public double getExp_amount() {
		return exp_amount;
	}

	public void setExp_amount(double exp_amount) {
		this.exp_amount = exp_amount;
	}



	@Override
	public String toString() {
		return "ExpenseTicket [id_expense_ticket=" + id_expense_ticket + ", id_req_type=" + id_req_type
				+ ", id_employee=" + id_employee + ", ticket_description=" + ticket_description + ", ticket_status="
				+ ticket_status + ", sub_date=" + sub_date + ", res_date=" + res_date + ", exp_amount=" + exp_amount
				+ "]";
	}
	
	
	
	
	
}
