package review;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		// Why? application requirement, speed (time complexity), 
		ArrayList<Employee> employees = new ArrayList<Employee>();
	    Scanner sc = new Scanner(System.in);
	    int employeeNo;
	    try
	    {
	      int choice;
	      do
	      {
	        System.out.println(" *************** MENU ***************");
	        System.out.println("1 - Create employee");
	        System.out.println("2 - Delete an employee");
	        System.out.println("3 - Show employees");
	        System.out.println("4 - Exit");
	        System.out.println("Please enter an option:");
	        choice = Integer.parseInt(sc.nextLine());
	        switch (choice)
	        {
	        case 1: 
	          System.out.println("___ENTER NEW EMPLOYEE #" + (Employee.employeeCount + 1) + " DETAILS___");
			  System.out.println("Enter the employee name: ");
		  	  String name = sc.nextLine();
			  System.out.println("Enter the employee department: ");
			  String department = sc.nextLine();
			  System.out.println("Enter the employee age: ");
			  int age = Integer.parseInt(sc.nextLine());
			  System.out.println("Enter the employee email: ");
			  String email = sc.nextLine();
			  Employee e = new Employee();
			  e.setEmployee(name, department, age, email);
			  employees.add(e);
			  System.out.println("Employee #" + (Employee.employeeCount) + " has successfully been added!");
	          break;
	        case 2: 
	          System.out.println("Please enter the employee ID to delete:");
	          employeeNo = Integer.parseInt(sc.nextLine());
	          for (int i = 0; i < employees.size(); i++)
	          {
	        	  if (employees.get(i).getId() == employeeNo)
	        	  {
	        		  employees.remove(i);
	        		  break;
	        	  }
	          }
	          break;
	        case 3: 
	          System.out.println("Printing all employees...");
	          for (int i = 0; i < employees.size(); i++)
	        	  System.out.println(employees.get(i));
	          break;
	        case 4: 
	          System.out.println("Goodbye!");
	          System.exit(0);
	        }
	      } while (choice != 4);
	    }
	    catch (Exception e)
	    {
	      System.out.println("An error has occurred! Please enter a valid input!");
	      System.out.println("Error details - " + e);
	      System.out.println("Restarting the main program...");
	      main(args);
	    }
	    sc.close();
		
	}
	
}
