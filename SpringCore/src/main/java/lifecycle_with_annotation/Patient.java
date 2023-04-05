package lifecycle_with_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
	
	@PostConstruct
	public void hi()
	{
		System.out.println("Hi, I am inside the init method!\nIn init(), write the code to reserve resources (DB Connection, call to REST APIs)");
	}
	
	@PreDestroy
	public void bye()
	{
		System.out.println("Bye, this is the destroy method!");
	}
	
}
