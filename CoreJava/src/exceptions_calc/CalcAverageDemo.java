package exceptions_calc;

import java.util.Scanner;

public class CalcAverageDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CalcAverage calcAverage = new CalcAverage();
		System.out.println("Please enter a natural number: ");
		int n = Integer.parseInt(sc.nextLine());
		try 
		{
			double avg = calcAverage.avgFirstN(n);
			System.out.println("The average of the first N (" + n + ") natural numbers is " + avg);	
		}
		catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Goodbye!");
		
	}
}
