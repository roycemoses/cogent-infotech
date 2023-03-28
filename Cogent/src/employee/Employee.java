package employee;

public class Employee {

	private int empId;
	private String empName;
	private String designation;
	private double basic;
	private final double HRA;
	
	public Employee(int empId, String empName, String designation, double basic) throws LowSalException, InvalidDesignationException
	{
		if (basic < 500.0)
			throw new LowSalException("Error! Please set the basic value greater than or equal to 500.0");
		if (!designation.equals("Manager") && !designation.equals("Officer") && !designation.equals("Clerk"))
			throw new InvalidDesignationException("Error! Please enter a valid designation (\"Manager\", \"Officer\", \"Clerk\")");
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.basic = basic;
		this.HRA = calculateHRA();
	}
	
	public void printDET() 
	{
		System.out.println("_____Employee Details_____");
		System.out.println("Employee ID: " + this.empId);
		System.out.println("Employee Name: " + this.empName);
		System.out.println("Designation: " + this.designation);
		System.out.println("Basic: " + this.basic);
		System.out.println("HRA: " + this.HRA);
	}
	
	private double calculateHRA() 
	{
		double result = 0.0;
		System.out.println(this.designation);
		if (this.designation.equals("Manager"))
			result = .10 * this.basic;
		else if (this.designation.equals("Officer"))
			result = .12 * this.basic;
		else if (this.designation.equals("Clerk"))
			result = .05 * this.basic;
		else
			System.out.println("Invalid designation! Must be: \"Manager\", \"Officer\", or \"Clerk\"");
		
		return result;
	}
	
}
