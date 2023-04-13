package lambda_expressions;

@FunctionalInterface
interface MySumFunctionalInterface
{
	public int sum(int a, int b);
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
		
//		MySumFunctionalInterface mi = (int a, int b) -> { return a + b; } ;
		MySumFunctionalInterface sumInterface = (a, b) -> a + b; // same as above, but shortened
		int sum = sumInterface.sum(100, 200);
		System.out.println(sum);
		
		MySquareFunctionalInterface productInterface = (s) -> s * s;
		int product = productInterface.product(4);
		System.out.println(product);
		
	}

}
