package polymorphism;

// example of overloading (compile time polymorphism/static binding)
class Calculator {
	
	public void add(int a, int b) 
	{
		int result = a + b;
		System.out.println("Sum of two integers: " + result);
	}
	
	public void add(float a, float b)
	{
		float result = a + b;
		System.out.println("Sum of two floats: " + result);
	}
	
	public void add(String a, String b)
	{
		String result = a + b;
		System.out.println("Concatenation: " + result);
	}
	
}

public class MethodOverloadingDemo {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.add(100,200);
		calc.add(1.25f,2.25f);
		calc.add(1.25f,1);
		calc.add("Hello"," world");
		
	}
	
}
