package exceptions;

import java.util.Scanner;

public class InvalidAgeExceptionTest {

	public void validateAge(int age) throws InvalidAgeException
	{
		if (age >= 18)
			System.out.println("Valid age");
		else
			throw new InvalidAgeException("Age is not valid");
//			System.out.println("Age is not valid");
	}
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = Integer.parseInt(sc.nextLine());
		
		InvalidAgeExceptionTest test = new InvalidAgeExceptionTest();
		
		try
		{
			test.validateAge(age);
		}
		catch (InvalidAgeException ia)
		{
			System.out.println("Caught a user-defined exception: " + ia.getMessage());
		}
		
		
		
	}
	
}
