package employee_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DepartmentTest {
	
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
		
		
		System.out.println("_____ ENTER A NEW RECORD _____");
		System.out.println("Department Number: ");
		int dept_num = Integer.parseInt(sc.nextLine());
		System.out.println("Employee ID: ");
		int emp_id = Integer.parseInt(sc.nextLine()); 
		System.out.println("Employee name: ");
		String emp_name = sc.nextLine();
		System.out.println("Employee salary: ");
		float emp_salary = Float.parseFloat(sc.nextLine());
		query = "INSERT INTO Dept(dept_num, emp_id, emp_name, emp_salary) values (" + dept_num + ", " + emp_id + ", '" + emp_name + "', " + emp_salary + ")";

		Statement stmt = conn.createStatement();
		int numOfRowsUpdated = stmt.executeUpdate(query);
		System.out.println("Number of rows updated: " + numOfRowsUpdated);

		
		System.out.println("Updating employee salary...");
		System.out.println("Enter the employee ID of the employee you want to update salary.");
		emp_id = Integer.parseInt(sc.nextLine()); 
		System.out.println("Enter the new salary: ");
		float new_emp_salary = Float.parseFloat(sc.nextLine());

		stmt = conn.createStatement();
		
		numOfRowsUpdated = stmt.executeUpdate("UPDATE dept SET emp_salary = " + new_emp_salary + " WHERE emp_id = '" + emp_id + "'");
		System.out.println("Calling update query...\nNumber of rows updated: " + numOfRowsUpdated);

		
		System.out.println("Enter the department number where you want to change all salaries to 9999: ");
		dept_num = Integer.parseInt(sc.nextLine());
		new_emp_salary = 9999;

		stmt = conn.createStatement();
	
		numOfRowsUpdated = stmt.executeUpdate("UPDATE dept SET emp_salary = " + new_emp_salary + " WHERE dept_num = '" + dept_num + "'");
		System.out.println("Calling update query...\nNumber of rows updated: " + numOfRowsUpdated);
		
		System.out.println("Outputting all employees from department 10 and 30...");

		PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM dept WHERE dept_num = 10 OR dept_num = 30");
		
		ResultSet rs = pstmt.executeQuery();
		while (rs.next())
		{
			System.out.println("dept_num: " + rs.getInt("dept_num"));
			System.out.println("emp_id: " + rs.getInt("emp_id"));
			System.out.println("emp_name: " + rs.getString("emp_name"));
			System.out.println("emp_salary: " + rs.getFloat("emp_salary"));
			System.out.println();
		}
		
		System.out.println("Enter the employee ID to print out details: ");
		emp_id = Integer.parseInt(sc.nextLine());
		
		pstmt = conn.prepareStatement("SELECT * FROM dept WHERE emp_id = " + emp_id);
		
		System.out.println("Printing details of employee ID #" + emp_id);
		rs = pstmt.executeQuery();
		while (rs.next())
		{
			System.out.println("dept_num: " + rs.getInt("dept_num"));
			System.out.println("emp_id: " + rs.getInt("emp_id"));
			System.out.println("emp_name: " + rs.getString("emp_name"));
			System.out.println("emp_salary: " + rs.getFloat("emp_salary"));
			System.out.println();
		}

		
		System.out.println("Enter the employee ID to print out details: ");
		emp_id = Integer.parseInt(sc.nextLine());
		pstmt = conn.prepareStatement("SELECT * FROM dept WHERE emp_id = " + emp_id);
		System.out.println("Printing details of employee ID #" + emp_id);
		rs = pstmt.executeQuery();
		while (rs.next())
		{
			System.out.println("dept_num: " + rs.getInt("dept_num"));
			System.out.println("emp_id: " + rs.getInt("emp_id"));
			System.out.println("emp_name: " + rs.getString("emp_name"));
			System.out.println("emp_salary: " + rs.getFloat("emp_salary"));
			System.out.println();
		}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
