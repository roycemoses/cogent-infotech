package lambda_expressions;

import java.util.Scanner;

@FunctionalInterface
interface ComputeStringInterface {
	public int compute(String s);
}

public class StringLengthLambdaExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		ComputeStringInterface length = (s) -> (s.length()); 
		ComputeStringInterface charValue = (s) -> (s.charAt(0));
		
		System.out.println(length.compute(input));
		System.out.println(charValue.compute(input));
		
		sc.close();
	}
}
