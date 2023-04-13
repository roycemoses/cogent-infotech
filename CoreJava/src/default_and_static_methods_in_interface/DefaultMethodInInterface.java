package default_and_static_methods_in_interface;

interface MyInterface // interfaces are pure abstraction
{
	void m1();
	void m2();
	void m3();
	default void m4() { System.out.println("This is m4!"); }	
}

class A implements MyInterface
{
	@Override 
	public void m1() { System.out.println("A: m1!"); };
	@Override 
	public void m2() { System.out.println("A: m2!"); };
	@Override 
	public void m3() { System.out.println("A: m3!"); };
}

class B implements MyInterface
{
	@Override 
	public void m1() { System.out.println("B: m1!"); };
	@Override 
	public void m2() { System.out.println("B: m2!"); };
	@Override 
	public void m3() { System.out.println("B: m3!"); };
}

public class DefaultMethodInInterface {

	public static void main(String[] args) {
		
		MyInterface mi = new A();
		mi.m4();
		mi = new B();
		mi.m4();
		
	}

}
