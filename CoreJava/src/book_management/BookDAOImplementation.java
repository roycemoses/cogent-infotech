package book_management;

import java.util.ArrayList;
import java.util.Scanner;

import dao_implementations.Book;

public class BookDAOImplementation implements BookDAO {

	private ArrayList<Book> books;
	
	BookDAOImplementation()
	{
		books = new ArrayList<Book>();
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void add(int n)
	{
		for (int i = 0; i < n; i++)
		{
			Book b = new Book();
			System.out.println("Enter the ID of book " + (i + 1));
			b.setBookID(Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the name of book " + (i + 1));
			b.setBookName(sc.nextLine());
			System.out.println("Enter the price of book " + (i + 1));
			b.setBookPrice(Float.parseFloat(sc.nextLine()));
			books.add(b);
		}
	}
	
	public void update(int bookID)
	{		
		Book b = new Book();
		System.out.println("Please enter the updated details for book #" + bookID + "!");
		System.out.println("Enter the new ID:");
		b.setBookID(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the new name:");
		b.setBookName(sc.nextLine());
		System.out.println("Enter the new price:");
		b.setBookPrice(Float.parseFloat(sc.nextLine()));
		
		int bookIndex = findBookIndex(bookID);
		this.books.set(bookIndex, b);
		
		System.out.println("\nBook #" + bookID + " has successfully been updated.");
	}
	
	public void delete(int bookID)
	{
		int bookIndex = findBookIndex(bookID);
		this.books.remove(bookIndex);
		System.out.println("\nBook #" + bookID + " has successfully been deleted.");
	}
	
	public void find(int bookID)
	{
		int index = 0;
		for (int i = 0; i < this.books.size(); i++)
		{
			if (this.books.get(i).getBookID() == bookID)
			{
				Book b = this.books.get(i);
				System.out.println("Found book #" + bookID + "! Here are the book details:");
				System.out.println("Book name: " + b.getBookName());
				System.out.println(String.format("Book price: %.2f", b.getBookPrice()));
				System.out.println();
				return;
			}
		}
		System.out.println("Could not find book #" + bookID + "!");
	}
	
	public void print()
	{
		for (Book b:books)
		{
			if (b == null)
				continue;
			System.out.println("Book ID: " + b.getBookID());
			System.out.println("Book name: " + b.getBookName());
			System.out.println(String.format("Book price: %.2f", b.getBookPrice()));
			System.out.println();
		}
	}
	
	private int findBookIndex(int bookID)
	{
		int index = 0;
		for (int i = 0; i < this.books.size(); i++)
			if (this.books.get(i).getBookID() == bookID)
				index = i;
		return index;
	}
	
}
