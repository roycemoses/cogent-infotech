package gl.itp.hyd65.cs65.Royce;

public class Greeter {
	
	String name;
	
	public Greeter(String aName)
	{
		this.name = aName;
	}
	
	public String sayHello()
	{
		return ("Hello, " + this.name + "!");
	}
	
	public String sayGoodbye()
	{
		return ("Goodbye, " + this.name + "!");
	}

	
}
