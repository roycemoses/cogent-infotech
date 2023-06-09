package cogent;
//import java.util.Scanner;


public class StringDemo {

	public static void main(String[] args) {
		
//		String s1 = "Hello";
//		String s2 = "Hello";
//		String s3 = s2;
//		String s4 = new String("Hello");
//		
//		if (s3 == s4)
//			System.out.println("Both strings are equal");
//		else
//			System.out.println("Strings are not equal");
		
		// does not work, strings are immutable
//		String firstName = "Royce";
//		firstName.concat(firstName);
//		System.out.println(firstName);
		
		// works, because this initializes in memory correctly
//		String firstName = "Royce";
//		String fullName = firstName.concat("Moses");
//		System.out.println(fullName);
		
		// Length function built in the String class
//		String firstName = "Royce";
//		int l = firstName.length();
//		System.out.println("Length of string is: " + l);
		
		// works! because StringBuilder is mutable
//		StringBuilder st = new StringBuilder("Cogent");
//		System.out.println(st);
//		st.append(" Infotech");
//		System.out.println(st);
			
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a String");
		
		if (args.length != 1)
		{
			System.out.println("Please enter one string as a command line argument!");
		}
		else
		{
			String st = args[0];
			System.out.println("The length of the String is: " + st.length());
			String upper_st = st.toUpperCase();
			boolean palindrome = true;
			for (int i = 0; i < st.length() / 2; i++)
			{
				if (st.charAt(i) != st.charAt(st.length()-i-1))
				{
					System.out.println(upper_st + " is not a palindrome");
					palindrome = false;
					break;
				}
			}
			if (palindrome)
				System.out.println(upper_st + " is a palindrome");
		}
		
		
		
	}

}
