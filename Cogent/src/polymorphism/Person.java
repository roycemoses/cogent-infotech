package polymorphism;

public class Person {

	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void interact() {
		System.out.println(this.name + " is idle");
	}
	
}
