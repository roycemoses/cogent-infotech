package java_based_bean_configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {

	private int id;
	private String name;
	private int age;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
