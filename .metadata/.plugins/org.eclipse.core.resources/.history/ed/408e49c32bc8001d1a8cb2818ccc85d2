package inheritance;

class Grandfather
{
	private int grandfatherAge;
	
	public Grandfather(int grandfatherAge) {
		this.grandfatherAge = grandfatherAge;
	}
	
	public void displayGrandfatherAge() {
		System.out.println("Grandfather age: " + this.grandfatherAge);
	}
	
}

class Father extends Grandfather
{
	private int fatherAge;
	
	public Father(int fatherAge) {
		super(fatherAge+30);
		this.fatherAge = fatherAge;
	}
	
	public void displayFatherAge()
	{
		displayGrandfatherAge();
		System.out.println("Father age: " + this.fatherAge);
	}
	
}

class Son extends Father
{
	int sonAge;
	public Son(int sonAge) {
		super(sonAge+30);
		this.sonAge = sonAge;
	}
	
	public void displaySonAge()
	{
		displayFatherAge();
		System.out.println("Son age: " + this.sonAge);
	}
	
}


public class MultilevelInheritance {
	public static void main(String[] args) {
		
		Son son = new Son(20);
		son.displaySonAge();
		
	}
}
