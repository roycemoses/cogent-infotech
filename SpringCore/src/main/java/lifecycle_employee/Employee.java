package lifecycle_employee;

public class Employee {

	int id;
	String name;
	
	public void init()
	{
		System.out.println("Hi! I'm in the init method!");
	}
	
	public void destroy()
	{
		System.out.println("Hello! I'm in the destroy method!");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee[id="+id+", name="+name+"]";
	}
	
	
}
