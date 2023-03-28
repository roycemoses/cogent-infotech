package cogent;
import java.util.Scanner;



public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		/*
		 * This is a multi-line comment
		 * in Java
		 */
		
		// single line comment
		// a program to demonstrate variables
//		byte a = 50;
//		short b = 30;
//		int c = 10000;
//		long d = 20000;
//		char e = 'A';
//		
//		float f = 1.23f;
//		double g = 12345.6789;
//		
//		int result = a + b;
//		
//		System.out.println("Result is: " + result);
		
		
//		// implicit type casting
//		// since int has a larger capacity, this conversion is automatic
//		byte b = 100;
//		int i = b;
//		System.out.println("i is = " + i);
//		
//		// implicit type casting
//		// since long has a larger capacity, this conversion is automatic
//		long l = i;
//		System.out.println("l is = " + l);
//		
//		// implicit type casting
//		// since int has a larger capacity, this conversion is automatic
//		char ch = 'A';
//		int x = ch;
//		System.out.println("x is = " + x);
		
//		
//		// explicit type casting
//		// since byte has a smaller capacity, this conversion must be explicit (byte)
//		int i = 100;
//		byte b = (byte)i;
//		
//		// explicit type casting
//		// since char has a smaller capacity, this conversion must be explicit (char)
//		int x = 97;
//		char ch = (char)x;
//		System.out.println("ch is = " + ch);
//		
//		// explicit type casting
//		// since byte has a smaller capacity, this conversion must be explicit (byte)
//		int y = 130;
//		byte z = (byte)y;
		
		// String concatenation
//		String a = "100";
//		String b = "200";
//		String result = a + b;
//		System.out.println(result);
		
		// taking input from user
//		int day;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter the day between 1 to 7");
//		day = sc.nextInt();
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value.");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++)
		{
			if (i % 2 == 0)
				System.out.println(i);
		}
		
		
		
		
		
		
	}
}
