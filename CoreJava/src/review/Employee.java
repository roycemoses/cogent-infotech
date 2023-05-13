package review;

public class Employee {

	private int id;
	private String name;
	private String department;
	private int age;
	private String email;
	public static int employeeCount = 0;
	
	public Employee() {
		this.id = employeeCount + 1;
		employeeCount++;
	}
	
	public void setEmployee(String name, String department, int age, String email)
	{
		this.name = name;
		this.department = department;
		this.age = age;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", name=" + this.name + ", department=" + this.department + ", age=" + this.age + ", email=" + this.email + "]";
	}

	public int getId() { return id; }
	
	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public String getDepartment() { return department; }

	public void setDepartment(String department) { this.department = department; }

	public int getAge() { return age; }

	public void setAge(int age) { this.age = age; }

	public String getEmail() { return email; }

	public void setEmail(String email) { this.email = email; }
	
	
	
}
