package com.driver;



import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;

public class Driver {

	public static void main(String[] args){
		
	//populate some data 
				//Employee emp = new Employee("usernamechan","chan","non","admin","123");
				//"usernamechan"
				//"123"
				String username = "usernamechan";
				String password = "123";
				
				
				//to access the methods to persist data, we first
				//must create an object of type PetDaoImpl
				
				EmployeeDaoImpl pdImpl = new EmployeeDaoImpl();
				Employee checkemp = new Employee();
				
			checkemp =pdImpl.selectEmployee(username, password);
			//System.out.println(checkemp);
				if(checkemp==(null))
				{
					System.out.println("WRONG USERNAME OR PASSWORD!");
				}
				else if(username.equals(checkemp.getUsername()) & password.equals(checkemp.getPassword()))
				{
					if("admin".equals(checkemp.getPosition()))
					{
						System.out.println("I am login as admin");
					}
					if("employee".equals(checkemp.getPosition()))
					{
						System.out.println("I am login as empoyee");
					}
					
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
