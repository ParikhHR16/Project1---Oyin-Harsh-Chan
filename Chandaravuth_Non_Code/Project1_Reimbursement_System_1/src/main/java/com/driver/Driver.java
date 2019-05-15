package com.driver;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;

public class Driver {

	public static void main(String[] args) {
		
		//populate some data 
				//Employee emp = new Employee("usernamechan","chan","non","admin","123");
				
				String username = "usernamechan";
				String password = "123";
				
				
				//to access the methods to persist data, we first
				//must create an object of type PetDaoImpl
				
				EmployeeDaoImpl pdImpl = new EmployeeDaoImpl();
				Employee checkemp = new Employee();
				
				
				checkemp =pdImpl.selectEmployee(username, password);
				
				if(username.equals(checkemp.getUsername()) & password.equals(checkemp.getPassword())) {
					
					System.out.println("I am login as admin");
				}
				else {
					System.out.println("fail!!!!!!!!!!!");
				}
				
				
		    //	pdImpl.insertEmployee(emp);
			//	pdImpl.insertPet(petTwo);
			//	pdImpl.insertPet(petThree);
			//	pdImpl.insertPet(petFour);
			//	pdImpl.insertPet(petFive);
				
			//	petFour.setType("Salamander");
			//	pdImpl.updatePet(petFour);
			//	pdImpl.deletePet(petTwo);
				
				//System.out.println(pdImpl.selectAllPets());
		
	}

}
