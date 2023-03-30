package default_and_static_methods_in_interface;

interface MyInterfaceWithStatic
{
	public static void m1()
	{
		System.out.println("hi! I'm this interface's static method~");
	}
}

public class StaticMethodInInterface implements MyInterfaceWithStatic {

	public static void main(String[] args) {
		
		MyInterfaceWithStatic.m1(); // valid
//		// invalid
//		m1();
//		Main m = new Main();
//		m.m1();
		
	}
	
	public static void m1()
	{
		System.out.println("yo! I'm main's static method!");
	}
	
}
