package exceptions;

import java.util.Scanner;

public class ExceptionDemo {

	public void message()
	{
		System.out.println("yo");
	}
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter two integers: ");
//		int x = Integer.parseInt(sc.nextLine());
//		int y = Integer.parseInt(sc.nextLine());
//		try 
//		{
//			int z = x / y; // divide by 0 causes java.lang.ArithmeticException: / by zero
//			System.out.println("z = " + z);
//		}
//		catch (ArithmeticException e) // caught exception, catches the thrown object
//		{
//			System.out.println("This is a caught exception! ArithmeticException: " + e.getMessage());
//		}
//		System.out.println("Welcome!");
		
//		String[] names = {"Chris", "Charles", "Koko", "Chelsea"};
//		try
//		{
//			System.out.println(names[10]); // accessing 10th element causes java.lang.ArrayIndexOutOfBoundsException
//		}
//		catch (ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("This is a caught exception! ArrayIndexOutOfBoundsException: " + e.getMessage());
//		}
//		System.out.println("Welcome!");
		
//		ExceptionDemo demo = null;
//		try
//		{
//			demo.message(); // attempting to call a function from null causes java.lang.NullPointerException
//		}
//		catch (Exception e)
//		{
//			System.out.println("This is a caught exception! NullPointerException: " + e.getMessage());
//			e.printStackTrace();
//		}
		
		try 
		{
			String input = args[0];
			System.out.println("Input (args[0]): " + input);
			int output = Integer.parseInt(input);
		}
//		catch (Exception e)
//		{
//			System.out.println("This is a caught exception!");
//			e.printStackTrace();
//		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("This is a caught exception! ArrayIndexOutOfBoundsException: " + e.getMessage());
			e.printStackTrace();
		}
		catch (NumberFormatException e)
		{
			System.out.println("This is a caught exception! NumberFormatException: " + e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Both cases are covered!");
		}
		System.out.println("Welcome!");
		
		
	}
	
}
