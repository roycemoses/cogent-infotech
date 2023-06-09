package exceptions_calc;

import java.util.Scanner;

public class NumberDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two integers: ");
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		Number number = new Number(a, b);
		
		int option = 0;
		do {
			System.out.println("1. Add (a+b)");
			System.out.println("2. Subtract (a-b)");
			System.out.println("3. Multiply (a*b)");
			System.out.println("4. Divide (a/b)");
			System.out.println("5. Exit");
			
			option = Integer.parseInt(sc.nextLine());
			switch (option)
			{
				case 1:
					number.add();
					break;
				case 2:
					number.sub();
					break;
				case 3:
					number.mul();
					break;
				case 4:
					number.div();
					break;
			}
			System.out.println();
			System.out.println("Result: " + number.getResult());
			System.out.println();
		} while (option != 5);
		System.out.println("Goodbye!");
		sc.close();
	}
	
}
