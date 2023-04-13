package book_management;

import java.util.ArrayList;
import java.util.Scanner;

import dao_implementations.Book;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<Book>();
		BookDAO dao = new BookDAOImplementation();
		Scanner sc = new Scanner(System.in);
		int choice;
		int bookID;
		
		do {
			System.out.println(" *************** MENU ***************");
			System.out.println("1 - Add books"); 
			System.out.println("2 - Update book");
			System.out.println("3 - Delete book");
			System.out.println("4 - Find book");
			System.out.println("5 - Print all books");
			System.out.println("6 - Exit");
			System.out.println("Please enter an option:");
			choice = Integer.parseInt(sc.nextLine());
			switch(choice)
			{
				case 1:
					System.out.println("How many books would you like to add?");
					int n = Integer.parseInt(sc.nextLine());
					dao.add(n);
					break;
				case 2:
					System.out.println("Please enter the book ID of the book you want to update:");
					bookID = Integer.parseInt(sc.nextLine());
					dao.update(bookID);
					break;
				case 3:
					System.out.println("Please enter the book ID of the book you want to delete:");
					bookID = Integer.parseInt(sc.nextLine());
					dao.delete(bookID);
					break;
				case 4:
					System.out.println("Please enter the book ID of the book you want to find: ");
					bookID = Integer.parseInt(sc.nextLine());
					dao.find(bookID);
					break;
				case 5:
					System.out.println("Printing all books...");
					System.out.println("");
					dao.print();
					break;
				case 6:
					System.exit(0);
					break;
			}
			
		} while(choice != 6);
		
	}
	
}
