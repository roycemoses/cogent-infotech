package employee_test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		String query = "SELECT * FROM employee";
		// jdbc, mysql,localhost at port 3306, using 'test' database
		String connectionURL = "jdbc:mysql://localhost:3306/test";
		Scanner sc = new Scanner(System.in);
		System.out.println("Log into MySQL80 local instance: ");
		String pw = sc.nextLine();
		
		// ***EXECUTE QUERY***
//		try // try with resource... connection objects are automatically closed
//		(
//			Connection conn = DriverManager.getConnection(connectionURL, "root", "bJ&0^1hh87va");
////			Statement stmt = conn.createStatement();
//			PreparedStatement pstmt = conn.prepareStatement(query);
//		)
//		{
////			ResultSet rs = stmt.executeQuery(query);
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next())
//			{
//				System.out.println("emp_id: " + rs.getInt("emp_id"));
//				System.out.println("emp_name: " + rs.getString("emp_name"));
//				System.out.println("emp_salary: " + rs.getFloat("emp_salary"));
//				System.out.println();
//			}
//			
//		}
//		catch (Exception e)
//		{
//			System.out.println(e);
//		}
		
		// ***EXECUTE UPDATE***
//		query = "INSERT INTO Employee(emp_id, emp_name, emp_salary) values (3000, 'Charles', 9001.9001)";
//		try
//		(
//			Connection conn = DriverManager.getConnection(connectionURL, "root", "bJ&0^1hh87va");
//			Statement stmt = conn.createStatement();
//		)
//		{
//			int numOfRowsUpdated = stmt.executeUpdate(query);
//			System.out.println("Number of rows updated: " + numOfRowsUpdated);			
//		
////			int numOfRowsUpdated = stmt.executeUpdate("UPDATE Employee SET emp_salary = 10000 WHERE emp_name = 'Royce'");
////			System.out.println("Calling update query...\nNumber of rows updated: " + numOfRowsUpdated);
//			
//		}
//		catch (Exception e)
//		{
//			System.out.println(e);
//		}
		
////		 ***GET META DATA***
//		try // try with resource... connection objects are automatically closed
//		(
//			Connection conn = DriverManager.getConnection(connectionURL, "root", "bJ&0^1hh87va");
//			Statement stmt = conn.createStatement();
//		)
//		{
//			ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE");
//			ResultSetMetaData rsMetaData = rs.getMetaData();
//			int numOfColumns = rsMetaData.getColumnCount();
//			System.out.println("Table name: " + rsMetaData.getTableName(1));
//			System.out.println("Total number of columns: " + numOfColumns);
//			for (int i = 1; i < numOfColumns; i++)
//			{
//				String columnName  = rsMetaData.getCatalogName(i);
//				System.out.println("Column Number: " + i);
//				System.out.println("Column Name: " + columnName);
//			}			
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		
		query = "CALL retrieve_persons";
		try
		(
			Connection conn = DriverManager.getConnection(connectionURL, "root", pw);
		)
		{
			CallableStatement callablestmt = conn.prepareCall(query);
			ResultSet rs = callablestmt.executeQuery();
			while (rs.next())
			{
				System.out.println("ID: " + rs.getInt(1));
				System.out.println("First name: " + rs.getString(2));
				System.out.println("Last name: " + rs.getString(3));
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
}
