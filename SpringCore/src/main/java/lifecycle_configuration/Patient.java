package lifecycle_configuration;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Yoo I'm inside setId()!");
	}
	
	@Override
	public String toString() {
		return "Patient[id=" + id + "]";
	}
	
	public void init()
	{
		System.out.println("Hi, I am inside the init method!\nIn init(), write the code to reserve resources (DB Connection, call to REST APIs)");
	}
	
	public void destroy()
	{
		System.out.println("Hello, this is the destroy method!");
	}
	
}
