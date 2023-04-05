package employee_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeTest {

	public static void main(String[] args) {
		
		String query = "SELECT * FROM employee";
		// jdbc, mysql,localhost at port 3306, using 'test' database
		String connectionURL = "jdbc:mysql://localhost:3306/test";
		try // try with resource... connection objects are automatically closed
		(
			Connection conn = DriverManager.getConnection(connectionURL, "root", "bJ&0^1hh87va");
//			Statement stmt = conn.createStatement();
			PreparedStatement pstmt = conn.prepareStatement(query);
		)
		{
//			ResultSet rs = stmt.executeQuery(query);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				System.out.println(rs.getInt("emp_id"));
				System.out.println(rs.getString("emp_name"));
				System.out.println(rs.getFloat("emp_salary"));
			}
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}
