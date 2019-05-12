package TestProjecgt1.TestProjecgt1;

public class Employee {
	private int empID;
	private String username;
	private String firstName;
	private String lastName;
	
	
	public Employee() {

	}
	
	public Employee(String username) {
		
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", username=" + username + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}


	public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) {
		this.empID = empID;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Employee(int empID, String username, String firstName, String lastName) {
		super();
		this.empID = empID;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
	
	

}
