package com.dao;

import com.model.ReimbursementType;

public class ReimbursementTypeDaoImpl implements ReimbursementTypeDao {
	
	public static final String TABLE = "req_type";
	private static String url = "jdbc:oracle:thin:@orcl.cncthujmniwo.us-east-1.rds.amazonaws.com:1521:orcl";
	private static String username = "project1";
	private static String password = "password1";

	@Override
	public void insertReimbursementType(ReimbursementType exp) {
		

	}

	@Override
	public ReimbursementType selectReimbursementType(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateReimbursementType(ReimbursementType exp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteReimbursementType(ReimbursementType exp) {
		// TODO Auto-generated method stub

	}

}
