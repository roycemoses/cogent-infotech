package cogent;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BookTest {
	public static void main(String[] args) {
		
		// User input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the book number: ");
		int bookNum = sc.nextInt();
		System.out.println("Please enter the book name: ");
		String bookName = sc.nextLine();
		bookName = sc.nextLine();
		System.out.println("Please enter the book price: ");
		float bookPrice = sc.nextFloat();
		System.out.println("Please enter the author name: ");
		String authorName = sc.next();
		
		// Default constructor, using setters with user input
		Book b1 = new Book();
		b1.setBookNum(bookNum);
		b1.setBookName(bookName);
		b1.setBookPrice(bookPrice);
		b1.setAuthorName(authorName);
		System.out.println("____Book 1 Details____");
		System.out.println("Book number: " + b1.getBookNum());
		System.out.println("Book name: " + b1.getBookName());
		System.out.println("Book price: " + b1.getBookPrice());
		System.out.println("Author name: " + b1.getAuthorName());
		
		
		//////////////////
		System.out.println();
		
		
		// Parameterized constructor
		Book b2 = new Book(1004, "Java Jump Start", 10.00f, "John");
		System.out.println("____Book 2 Details____");
		System.out.println("Book number: " + b2.getBookNum());
		System.out.println("Book name: " + b2.getBookName());
		System.out.println("Book price: " + b2.getBookPrice());
		System.out.println("Author name: " + b2.getAuthorName());
		
		
		
		
	}
}
