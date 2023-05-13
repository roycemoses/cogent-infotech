package review;

public class Student {

	private int rollNo;
	private String name;
	private String address;
	private String email;
	
	Student() {}
	
	Student(int rollNo, String name, String address, String email)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.email = email;
	}	
	
	public int getRollNo() { return rollNo; }

	public void setRollNo(int rollNo) { this.rollNo = rollNo; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public String getAddress() { return address; }

	public void setAddress(String address) { this.address = address; }

	public String getEmail() { return email; }

	public void setEmail(String email) { this.email = email; }

	public void showDetails()
	{
		System.out.println("rollNo: " + this.rollNo);
		System.out.println("name: " + this.name);
		System.out.println("address: " + this.address);
		System.out.println("email: " + this.email);
	}
	
}
