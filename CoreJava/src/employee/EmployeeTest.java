package employee;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) throws LowSalException, InvalidDesignationException {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Please enter the employee ID:");
		int empId = Integer.parseInt(sc.nextLine());
		System.out.println("Please enter the name:");
		String empName = sc.nextLine();
		System.out.println("Please enter the designation:");
		String designation = sc.nextLine();
		System.out.println("Please enter the basic:");
		double basic = Double.parseDouble(sc.nextLine());
		
		Employee employee = null;
		try 
		{
			employee = new Employee(empId, empName, designation, basic);
			employee.printDET();
		}
		catch (LowSalException e)
		{
			System.out.println(e.getMessage());
			EmployeeTest.main(null);
		}
		catch (InvalidDesignationException e)
		{
			System.out.println(e.getMessage());
			EmployeeTest.main(null);
		}
		
		
	}
	
}
