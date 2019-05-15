package com.dao;

import java.sql.*;
import com.model.ExpenseTicket;

public class ExpenseTicketDaoImpl implements ExpenseTicketDao {
	
	public static final String TABLE = "expensekit";
	private static String url = "jdbc:oracle:thin:@orcl.cncthujmniwo.us-east-1.rds.amazonaws.com:1521:orcl";
	private static String username = "project1";
	private static String password = "password1";

	@Override
	public void insertExpenseTicket(ExpenseTicket exp) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			int id=0;
			PreparedStatement ps = conn.prepareStatement("INSERT INTO expensekit VALUES(?,?,?,?,?,?,?,?)");
			ps.setInt(1, exp.getId_expense_ticket());
			ps.setDouble(2, exp.getExp_amount());
			ps.setString(3,exp.getSub_date());
			ps.setString(4, exp.getRes_date());
			ps.setString(5, exp.getTicket_status());
			ps.setString(6, exp.getTicket_description());
			ps.setInt(7, exp.getId_req_type());
			ps.setInt(8,exp.getId_employee());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public ExpenseTicket selectExpenseTicket(String name) {

		return null;
	}

	@Override
	public void updateExpenseTicket(ExpenseTicket exp) {

	}

	@Override
	public void deleteExpenseTicket(ExpenseTicket exp) {

	}

}
