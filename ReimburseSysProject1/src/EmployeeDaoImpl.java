import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


public class EmployeeDaoImpl implements EmployeeDAO {

	private static String url = "jdbc:oracle:thin:@orcl.cncthujmniwo.us-east-1.rds.amazonaws.com:1521:orcl";
	private static String username = "project1";
	private static String password = "password1";
	
	
	//private static String url = "jdbc:oracle:thin:@db0429.cjdso6ohuu1q.us-east-2.rds.amazonaws.com:1521:db0429";
    //private static String username = "PetLover";
   // private static String password = "p4ssw0rd";
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee Emp1 = new Employee("name");
		Employee Emp2 = new Employee("name2");

		EmployeeDaoImpl empl = new EmployeeDaoImpl();
		//empl.insertEmployee(Emp1);
		//empl.insertEmployee(Emp2);
		
		System.out.println(empl.selectEmployee());
		
		

	}

	@Override
	public void insertEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		try {
			
			Connection conn = DriverManager.getConnection(url, username, password);
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO test VALUES(?)");
			ps.setString(1, e.getUsername());

			ps.executeUpdate();
		}
		catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
	}

	@Override
	public List<Employee> selectEmployee() {
		List<Employee> emp = new ArrayList<>();
		
		try {
			
			Connection conn = DriverManager.getConnection(url, username, password);
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM test");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
				
			{
				emp.add(new Employee(rs.getString(1)));
				
				
			}
			

		}
		catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		
		
		
		return emp;
	}





}
