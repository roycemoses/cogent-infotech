package employee_test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class CallableStatementTest {

	public static void main(String[] args) {
		
		String query = "SELECT * FROM employee";
		// jdbc, mysql,localhost at port 3306, using 'test' database
		String connectionURL = "jdbc:mysql://localhost:3306/rice";
		Scanner sc = new Scanner(System.in);
//		System.out.println("Log into MySQL80 local instance: ");
		String pw = "bJ&0^1hh87va"; // sc.nextLine();
		try
		(
			Connection conn = DriverManager.getConnection(connectionURL, "root", pw);
		)
		{
			// Initialize CallableStatement and pass in a parameter (emp_id) to the CallableStatement.
			// Prepare the call and execute it.
			System.out.println("Enter the employee ID to print employee name: ");
			int emp_id = Integer.parseInt(sc.nextLine());
			query = "{CALL proc_empname(?)}";
			CallableStatement callablestmt = conn.prepareCall(query);
			callablestmt.setInt(1, emp_id);
			ResultSet rs = callablestmt.executeQuery();
			while (rs.next())
			{
				System.out.println("Name: " + rs.getString("emp_name"));
			}
			
			// Use a callable statement and pass in a parameter (emp_id) to return the dept_name.
			System.out.println("Enter the employee ID to print department name: ");
			emp_id = Integer.parseInt(sc.nextLine());
			query = "{CALL proc_dname(?)}";
			callablestmt = conn.prepareCall(query);
			callablestmt.setInt(1, emp_id);
			rs = callablestmt.executeQuery();
			while (rs.next())
			{
				System.out.println("Department name: " + rs.getString("dept_name"));
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
