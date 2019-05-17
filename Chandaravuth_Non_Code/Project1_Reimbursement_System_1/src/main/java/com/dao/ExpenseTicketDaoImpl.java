package com.dao;

import java.sql.*;
import com.model.ExpenseTicket;

public class ExpenseTicketDaoImpl implements ExpenseTicketDao {
	static{

	       try {

	           Class.forName("oracle.jdbc.driver.OracleDriver");

	       } catch (ClassNotFoundException e) {

	           e.printStackTrace();

	       }

	   }
	
	public static final String TABLE = "expensekit";
	private static String url = "jdbc:oracle:thin:@orcl.cncthujmniwo.us-east-1.rds.amazonaws.com:1521:orcl";
	private static String username = "project1";
	private static String password = "password1";

	@Override
	public void insertExpenseTicket(ExpenseTicket exp) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			int id=0;
			PreparedStatement ps = conn.prepareStatement("INSERT INTO expensekit VALUES(?,?,?,?,?,?,?,?)");

			
			ps.setString(1, null);
			ps.setInt(2, exp.getId_employee());
			ps.setDouble(3,exp.getAmount_e_t());
			ps.setDate(4, (Date) exp.getSub_date_e_t());
			ps.setDate(5, (Date) exp.getRes_date_e_t());
			ps.setInt(6, exp.getStatus_e_t());
			ps.setString(7, exp.getDescription_e_t());
			ps.setInt(8, exp.getReq_e_t());
			ps.setInt(9, exp.getType_e_t());		
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
