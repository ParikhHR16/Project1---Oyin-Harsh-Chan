package com.dao;

import java.sql.ResultSet;

import com.model.Employee;

public interface EmployeeDao {
	
	// CREATE 
	public void insertEmployee(Employee exp);

	
	//READ
	public Employee selectEmployee(String name,String password);
	
	// UPDATE
	public void updateEmployee(Employee exp);
	
	//DELETE
	public void deleteEmployee(Employee exp);
}
