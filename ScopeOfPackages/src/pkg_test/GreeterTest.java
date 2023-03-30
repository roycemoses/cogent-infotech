package pkg_test;

import gl.itp.hyd65.cs65.Royce.Greeter;
import gl.itp.hyd65.cs65.Royce.Advisor;

public class GreeterTest {

	public static void main(String[] args) {
		
		Greeter[] greeters = new Greeter[args.length];
		Advisor advisor = new Advisor();
		
		// instantiate the greeters and hello
		for (int i = 0; i < args.length; i++)
		{
			greeters[i] = new Greeter(args[i]);
			System.out.println(greeters[i].sayHello());
		}
		
		System.out.println(advisor.getAdvice());
		
		// goodbye in reverse order
		for (int i = args.length - 1; i >= 0; i--)
			System.out.println(greeters[i].sayGoodbye());
		
	}
	
}
