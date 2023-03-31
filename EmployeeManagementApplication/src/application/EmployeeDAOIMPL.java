package application;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDAOIMPL
  implements EmployeeDAOInterface
{
  private ArrayList<Employee> employees;
  private Scanner sc = new Scanner(System.in);
  
  EmployeeDAOIMPL(ArrayList<Employee> employees)
  {
    this.employees = employees;
  }
  
  public void create(int n)
  {
    for (int i = 0; i < n; i++) {
      try
      {
        System.out.println("___ENTER NEW EMPLOYEE #" + (i + 1) + " DETAILS___");
        System.out.println("Enter the employee number: ");
        int employeeNo = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the employee name: ");
        String employeeName = sc.nextLine();
        System.out.println("Enter the employee address: ");
        String employeeAddress = sc.nextLine();
        System.out.println("Enter the employee email: ");
        String employeeEmail = sc.nextLine();
        System.out.println("Enter the employee salary: ");
        float employeeSalary = Float.parseFloat(sc.nextLine());
        Employee e = new Employee(employeeNo, employeeName, employeeAddress, employeeEmail, employeeSalary);
        employees.add(e);
      }
      catch (Exception e)
      {
        System.out.println("An error has occurred! Please enter a valid input!");
        System.out.println("Error details - " + e);
        System.out.println("NOTE: The current employee was not added to the list!");
        System.out.println("Would you like to see the current list of employees?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        try
        {
          int option = Integer.parseInt(sc.nextLine());
          if (option == 1)
          {
            System.out.println("Printing all employees...\n");
            read();
          }
          System.out.println("Returning to main menu...");
          return;
        }
        catch (Exception e2)
        {
          System.out.println("Returning to main menu...");
          return;
        }
      }
    }
  }
  
  public void update(int employeeNo)
  {
    int employeeIndex = findEmployeeIndex(employeeNo);
    if (employeeIndex == -1)
    {
      System.out.println("Error! Could not find employee #" + employeeNo + " in the database!");
      System.out.println("Update cancelled... returning to menu...");
      return;
    }
    System.out.println("Please enter the updated details for employee #" + employeeNo + "!");
    System.out.println("Enter the new employee number:");
    try
    {
      int employeeNewNo = Integer.parseInt(sc.nextLine());
      System.out.println("Enter the new employee name:");
      String employeeName = sc.nextLine();
      System.out.println("Enter the new employee address: ");
      String employeeAddress = sc.nextLine();
      System.out.println("Enter the new employee email: ");
      String employeeEmail = sc.nextLine();
      System.out.println("Enter the new employee salary: ");
      float employeeSalary = Float.parseFloat(sc.nextLine());
      
      Employee e = new Employee(employeeNewNo, employeeName, employeeAddress, employeeEmail, employeeSalary);
      employees.set(employeeIndex, e);
      
      System.out.println("\nEmployee #" + employeeNo + " has successfully been updated!");
    }
    catch (Exception e)
    {
      System.out.println("An error has occurred! Please enter a valid input!");
      System.out.println("Error details - " + e);
      System.out.println("NOTE: The employee (#" + employeeNo + ") was not updated!");
      System.out.println("Returning to main menu...");
      
      return;
    }
  }
  
  public void delete(int employeeNo)
  {
    int employeeIndex = findEmployeeIndex(employeeNo);
    if (employeeIndex == -1)
    {
      System.out.println("Error! Could not find employee #" + employeeNo + " in the database!");
      System.out.println("Deletion cancelled... returning to menu...");
      return;
    }
    employees.remove(employeeIndex);
    System.out.println("\nEmployee #" + employeeNo + " has successfully been deleted!");
  }
  
  public void read()
  {
    for (Employee e : employees)
    {
      System.out.println("PRINTING DETAILS FOR EMPLOYEE # " + e.getEmployeeNo() + "...");
      System.out.println("Employee number: " + e.getEmployeeNo());
      System.out.println("Employee name: " + e.getEmployeeName());
      System.out.println("Employee address: " + e.getEmployeeAddress());
      System.out.println("Employee email: " + e.getEmployeeEmail());
      System.out.println(String.format("Employee salary: %.2f \n", new Object[] { Float.valueOf(e.getEmployeeSalary()) }));
    }
  }
  
  public void search(int employeeNo)
  {
    int index = findEmployeeIndex(employeeNo);
    if (index == -1)
    {
      System.out.println("Error! Could not find employee #" + employeeNo + " in the database!");
      System.out.println("Search cancelled... returning to menu...");
      return;
    }
    Employee e = (Employee)employees.get(index);
    System.out.println("Found employee #" + e.getEmployeeNo() + "! Here are the employee details:");
    System.out.println("PRINTING DETAILS FOR EMPLOYEE # " + e.getEmployeeNo() + "...");
    System.out.println("Employee number: " + e.getEmployeeNo());
    System.out.println("Employee name: " + e.getEmployeeName());
    System.out.println("Employee address: " + e.getEmployeeAddress());
    System.out.println("Employee email: " + e.getEmployeeEmail());
    System.out.println(String.format("Employee salary: %.2f \n", new Object[] { Float.valueOf(e.getEmployeeSalary()) }));
  }
  
  public void sort()
  {
    System.out.println("EMPLOYEE LIST BEFORE SORTING: ");
    for (Employee e : employees) {
      System.out.println(e.getEmployeeName());
    }
    employees.sort(new EmployeeNameComparator());
    System.out.println("EMPLOYEE LIST AFTER SORTING: ");
    for (Employee e : employees) {
      System.out.println(e.getEmployeeName());
    }
    System.out.println("Successfully sorted the employees by name!\n");
    System.out.println("Printing all employees...\n");
    read();
  }
  
  private int findEmployeeIndex(int employeeNo)
  {
    for (int i = 0; i < employees.size(); i++) {
      if (((Employee)employees.get(i)).getEmployeeNo() == employeeNo) {
        return i;
      }
    }
    return -1;
  }
}
