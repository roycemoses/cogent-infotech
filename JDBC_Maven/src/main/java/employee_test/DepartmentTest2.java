package employee_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DepartmentTest2 {

	public static void main(String[] args) {
		
		String query = "SELECT * FROM employee";
		// jdbc, mysql,localhost at port 3306, using 'test' database
		String connectionURL = "jdbc:mysql://localhost:3306/rice";
		Scanner sc = new Scanner(System.in);
//		System.out.println("Log into MySQL80 local instance: ");
		String pw = "bJ&0^1hh87va"; // sc.nextLine();
		try 
		( Connection conn = DriverManager.getConnection(connectionURL, "root", pw); )
		{
			// OUTPUT HIGHEST SALARY using MAX() aggregate
			System.out.println("Outputting the highest salary in department 30...");
			query = "SELECT * FROM dept WHERE emp_salary = (SELECT MAX(emp_salary) FROM dept WHERE dept_num = 30)";		
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				System.out.println("Highest salary employee: " + rs.getString("emp_name"));
			}
			
			System.out.println();
			
			// OUTPUT manager_name using an employee_name
			System.out.println("Outputting Adam's manager...");
			query = "SELECT * FROM dept WHERE emp_name = 'Adam'";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next())
			{
				System.out.println("Adam's manager: " + rs.getString("manager_name"));
			}
			
			System.out.println();
			
			// OUTPUTTING EMPLOYEE DETAILS who have greater than average salary using aggregate AVG()
			System.out.println("Outputting all employees who have greater than average salary...");
			query = "SELECT * FROM dept WHERE emp_salary > (SELECT AVG(emp_salary) FROM dept)";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next())
			{
				System.out.println("Employee name: " + rs.getString("emp_name"));
				System.out.println("Employee number: " + rs.getString("emp_id"));
			}
			
			System.out.println();
			
			// OUTPUTTING all employee details that have same salary as emp_name = 'Ford'
			System.out.println("Outputting all employees who have the same salary as FORD...");
			query = "SELECT * FROM dept WHERE emp_salary = (SELECT emp_salary FROM dept WHERE emp_name = 'Ford')";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next())
			{
				System.out.println("Employee name: " + rs.getString("emp_name"));
				System.out.println("Employee number: " + rs.getString("emp_id"));
			}
			
			System.out.println();
			System.out.println("Outputting all employees who have the job title 'Analyst'...");
			query = "SELECT * FROM dept WHERE job_title = 'Analyst'";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next())
			{
				System.out.println("Employee name: " + rs.getString("emp_name"));
				System.out.println("Employee number: " + rs.getString("emp_id"));
			}
			
			
			
		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
