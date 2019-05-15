package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	public static final String TABLE = "employees";
	private static String url = "jdbc:oracle:thin:@orcl.cncthujmniwo.us-east-1.rds.amazonaws.com:1521:orcl";
	private static String username = "project1";
	private static String password = "password1";

	@Override
	public void insertEmployee(Employee exp) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			String sql = String.format("INSERT INTO %s  VALUES(?,?,?,?,?,?)", TABLE);
			PreparedStatement ps = conn.prepareStatement(sql);
			int i = 0;	
			ps.setString(++i, null);
			ps.setString(++i, exp.getUsername());
			ps.setString(++i, exp.getFirstname());
			ps.setString(++i, exp.getLastname());
			ps.setString(++i, exp.getPosition());
			ps.setString(++i, exp.getPassword());
			ps.executeUpdate();
			//exp.setId_emp(getMaxId(TABLE));

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
		
	  public void load(ResultSet rs,Employee exp) throws SQLException  {
		    exp.setId_emp(rs.getInt("e_id"));
		    exp.setUsername(rs.getString("e_username"));
		    exp.setFirstname(rs.getString("e_firstname"));
		    exp.setLastname(rs.getString("e_lastname"));
		  }

	@Override
	public Employee selectEmployee(String name, String p) {
		Employee employee = null;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			String sql = String.format("SELECT * FROM %s  WHERE e_username=? AND e_password=?", TABLE);
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, p);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				employee = new Employee(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public void updateEmployee(Employee exp) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
		    String sql = String.format(
		            "update %s set e_username=?,e_firstname=?,e_lastname=? where e_id=?", TABLE);
		    PreparedStatement ps = conn.prepareStatement(sql);
		    int i=0;
		    ps.setString(++i, exp.getUsername());
		    ps.setString(++i, exp.getFirstname());
		    ps.setString(++i, exp.getLastname());
		    ps.setInt(++i, exp.getId_emp());
		    ps.executeUpdate();

		    
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteEmployee(Employee exp) {
		// TODO Auto-generated method stub

	}

	public static int getMaxId(String table) throws SQLException {
		Connection conn = DriverManager.getConnection(url, username, password);

		String sql = String.format("select max(e_id) from %s", table);
		Statement st = conn.createStatement();
		if (true) {
			System.out.println("**getMaxId**");
		}
		ResultSet rs = st.executeQuery(sql);
		rs.next();

		return rs.getInt(1);
	}
	


}
