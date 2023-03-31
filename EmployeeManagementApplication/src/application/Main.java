package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    ArrayList<Employee> employees = new ArrayList<Employee>();
    EmployeeDAOIMPL dao = new EmployeeDAOIMPL(employees);
    Scanner sc = new Scanner(System.in);
    int employeeNo;
    try
    {
      int choice;
      do
      {
        System.out.println(" *************** MENU ***************");
        System.out.println("1 - Create employees");
        System.out.println("2 - Update an employee");
        System.out.println("3 - Delete an employee");
        System.out.println("4 - Read and print all employees");
        System.out.println("5 - Search for an employee");
        System.out.println("6 - Sort all employees based on name");
        System.out.println("7 - Exit");
        System.out.println("Please enter an option:");
        choice = Integer.parseInt(sc.nextLine());
        switch (choice)
        {
        case 1: 
          System.out.println("How many employees would you like to create?");
          int n = Integer.parseInt(sc.nextLine());
          dao.create(n);
          break;
        case 2: 
          System.out.println("Please enter the employee number to update:");
          employeeNo = Integer.parseInt(sc.nextLine());
          dao.update(employeeNo);
          break;
        case 3: 
          System.out.println("Please enter the employee number to delete:");
          employeeNo = Integer.parseInt(sc.nextLine());
          dao.delete(employeeNo);
          break;
        case 4: 
          System.out.println("Printing all employees...\n");
          dao.read();
          break;
        case 5: 
          System.out.println("Please enter the employee number to find: ");
          employeeNo = Integer.parseInt(sc.nextLine());
          dao.search(employeeNo);
          break;
        case 6: 
          System.out.println("Sorting employee list based on name...");
          dao.sort();
          break;
        case 7: 
          System.exit(0);
        }
      } while (choice != 7);
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