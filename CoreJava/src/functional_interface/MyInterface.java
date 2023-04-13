package functional_interface;

@FunctionalInterface
public interface MyInterface {

	//SAM - Single Abstract Method (ONLY!!!)
	public void m1();
	
	default void m2() // Can have as many default methods as desired
	{
		System.out.println("m2!");
	}
	
	public static void m3() // Can have as many static methods as desired
	{
		System.out.println("m3!");
	}
	
//	public void m4(); // NOT A FUNCTIONAL INTERFACE! because m4 is also abstract
	
}
