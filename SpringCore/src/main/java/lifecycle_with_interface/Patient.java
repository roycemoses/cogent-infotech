package lifecycle_with_interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {

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
	
	public void hi()
	{
		System.out.println("Hi, I am inside the init method!\nIn init(), write the code to reserve resources (DB Connection, call to REST APIs)");
	}
	
	public void bye()
	{
		System.out.println("Bye, this is the destroy method!");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Hi, I am inside the after properties set method!");

	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Bye! I am in the destroy method!");
	}
	
}
