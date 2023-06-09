package access_modifiers;

import java.util.Scanner;

public class BookTest {
	
	public static void createBooks(Book[] books)
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < books.length; i++)
		{
			Book b = new Book();
			System.out.println("Please enter the title of book " + (i+1) + ":");
			b.setBook_title(sc.nextLine());
			System.out.println("Please enter the price of book " + (i+1) + ":");
			b.setBook_price(Float.parseFloat(sc.nextLine()));
			books[i] = b;
		}
	}
	
	public static void showBooks(Book[] books)
	{
		System.out.println("Book Title\t\tPrice");
		for(int i = 0; i < books.length; i++)
		{
			System.out.println(books[i].getBook_title() + "\t\t\tRs." + books[i].getBook_price());
		}
	}
	
	public static void main(String[] args) {
		int n = 5;
		Book[] books = new Book[n];
		createBooks(books);
		showBooks(books);

//		for (int i = 0; i < books.length; i++)
//		{
//			System.out.println("____Book " + (i+1) + " Details____");
//			System.out.println("Title: " + books[i].getBook_title());
//			System.out.println("Price: " + books[i].getBook_price());
//		}
		
		
	}
	
	
}
