package lambda_expressions;

import java.util.function.Consumer;
import java.util.function.Supplier;

@FunctionalInterface
interface MyFunctionalInterface
{
	public int compute(int a, int b);
	
	default void method1() {
		System.out.println("method1");
	}

	static void method2() {
		System.out.println("method2");
	}
}

@FunctionalInterface
interface MySquareFunctionalInterface
{
	public int product(int x);
}

// Standard class!
//class MyClass implements MyInterface
//{
//	@Override
//	public int sum(int a, int b) { return a+b; }
//}

public class LambdaExpressionsDemo {

	public static void main(String[] args) {

		// Standard method call!
//		MyClass mc = new MyClass();
//		int sum = mc.sum(100, 200);
//		System.out.println("Sum: " + sum);
		
//		MyFunctionalInterface mi = (int a, int b) -> { return a + b; } ;
		MyFunctionalInterface sumInterface = (a, b) -> a + b; // same as above, but shortened
		MyFunctionalInterface subInterface = (x, y) -> x - y;
		int sum = sumInterface.compute(100, 200);
		int sub = subInterface.compute(100, 200);
		System.out.println(sum);
		System.out.println(sub);
		sumInterface.method1();
		
		MySquareFunctionalInterface productInterface = (s) -> s * s;
		int product = productInterface.product(4);
		System.out.println(product);
		
		Supplier<Integer> supplier = () -> 100;
		Supplier<Integer> supplier2 = () -> 200;
		System.out.println(supplier.get());
		System.out.println(supplier2.get());
		
		Consumer<Integer> consumer = a -> System.out.println(a);
		consumer.accept(3);
		
		MyFunctionalInterface.method2();
	}

}
