package access_modifiers;

class A
{
	int a;
	
	public A(int a)
	{
		this.a = a;
	}
	
}

class B extends A
{
	int b;
	
	public B(int a, int b)
	{
		super(a);
		this.b = b;
	}
	
	public void display()
	{
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
}

//class Parent
//{
//	int pAge = 50;
//	
//	public void display()
//	{
//		System.out.println("Parent Age: " + this.pAge);
//	}
//}
//
//class Child extends Parent
//{
//	int cAge = 25;
//	
//	public void display()
//	{
//		super.display();
//		System.out.println("Child age: " + this.cAge);
//	}
//}

public class SuperDemo {
	public static void main(String[] args) {
		
//		Parent ch = new Child();
//		
//		ch.display();
		
		B b = new B(1, 2);
		b.display();
		
	}
}
