package exceptions_calc;

public class Number {

	private int a;
	private int b;
	private double result; // stores the result of arithmetic operations performed on a and b
	
	public Number(int a, int b) { this.a = a; this.b = b; this.result = 0;}
	public void add() { this.result = this.a + this.b; }
	public void sub() { this.result = this.a - this.b; } 
	public void mul() { this.result = this.a * this.b; } 
	public void div() throws ArithmeticException
	{
		try { this.result = this.a / this.b; }
		catch (ArithmeticException e) { System.out.println("Invalid operation! Cannot divide by zero."); }
	} 
	
	public double getResult() { return this.result; } 
	
	
}
