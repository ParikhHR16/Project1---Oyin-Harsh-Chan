package com.dao;

import com.model.ReimbursementType;

public interface ReimbursementTypeDao {
	
	// CREATE 
	public void insertReimbursementType(ReimbursementType exp);
	
	//READ
	public ReimbursementType selectReimbursementType(String name);
	
	// UPDATE
	public void updateReimbursementType(ReimbursementType exp);
	
	//DELETE
	public void deleteReimbursementType(ReimbursementType exp);
}
