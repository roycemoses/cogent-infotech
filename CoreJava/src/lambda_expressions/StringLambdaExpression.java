package lambda_expressions;

@FunctionalInterface
interface MyStringLengthFunctionalInterface
{
	public int length(String s);
}

public class StringLambdaExpression {

	public static void main(String[] args) {
		
		MyStringLengthFunctionalInterface myInterface = (s) -> (s.length());
		
		String s = "Hi";
		
		System.out.println(myInterface.length(s));
		System.out.println(s.valueOf(0));
		
	}
	
}
