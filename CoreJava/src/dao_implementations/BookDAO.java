package dao_implementations;

import java.util.Scanner;

public class BookDAO {

	Scanner sc = new Scanner(System.in);
	public void create(Book[] books, int i)
	{
		Book b = new Book();
		books[i] = b;
		System.out.println("Enter the ID of book " + (i + 1));
		books[i].setBookID(sc.nextInt());
		System.out.println("Enter the name of book " + (i + 1));
		books[i].setBookName(sc.next());
		System.out.println("Enter the price of book " + (i + 1));
		books[i].setBookPrice(sc.nextFloat());
	}
	
	public void read(Book[] books)
	{
		for(Book b:books)
		{
			if (b == null)
				continue;
			System.out.println("Book ID: " + b.getBookID());
			System.out.println("Book name: " + b.getBookName());
			System.out.println(String.format("Book price: %.2f", b.getBookPrice()));
			System.out.println();
		}
	}
	
	public void update(Book[] books, int bookID)
	{
		int currBookIndex = findBookIndex(books, bookID);
		
		System.out.println("Please enter the updated details for book #" + bookID + "!");
		System.out.println("Enter the new ID:");
		books[currBookIndex].setBookID(sc.nextInt());
		System.out.println("Enter the new name:");
		books[currBookIndex].setBookName(sc.next());
		System.out.println("Enter the new price:");
		books[currBookIndex].setBookPrice(sc.nextFloat());
			
		System.out.println("\nBook #" + bookID + " has successfully been updated.");
	}
	
	public void delete(Book[] books, int bookID)
	{
		int currBookIndex = findBookIndex(books, bookID);
		books[currBookIndex] = null;
		System.out.println("\nBook #" + bookID + " has successfully been deleted.");
	}
	
	private int findBookIndex(Book[] books, int bookID)
	{
		int index = 0;
		for(int i = 0; i < books.length; i++)
			if (books[i].getBookID() == bookID)
				index = i;
		return index;
	}
}
