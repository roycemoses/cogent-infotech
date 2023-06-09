package dao_implementations;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Book[] books = null;
		BookDAO dao = new BookDAO();
		int choice = 0;
		int bookID = 0;
		do {
			System.out.println(" *************** MENU ***************");
			System.out.println("1 - Add book"); 
			System.out.println("2 - Print all books");
			System.out.println("3 - Update book");
			System.out.println("4 - Delete book");
			System.out.println("5 - Exit");	
			System.out.println("Please enter an option:");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("How many books would you like to add?");
					int n = sc.nextInt();
					books = new Book[n];
					for(int i = 0; i < books.length; i++)
						dao.create(books, i);
					break;
				case 2:
					System.out.println("Printing all books...");
					System.out.println("");
					dao.read(books);
					break;
				case 3:
					System.out.println("Please enter the book ID of the book you want to update:");
					bookID = sc.nextInt();
					dao.update(books, bookID);
					break;
				case 4:
					System.out.println("Please enter the book ID of the book you want to delete:");
					bookID = sc.nextInt();
					dao.delete(books, bookID);
					break;
				case 5:
					System.exit(0);
					break;
			}
			
		} while(choice != 5);
		
//		Scanner sc = new Scanner(System.in);
//		Person[] people = null;
//		PersonDAO dao = new PersonDAO();
//		int choice = 0;
//		do {
//			System.out.println(" *************** MENU ***************");
//			System.out.println("1 - Add person"); 
//			System.out.println("2 - Print person");
//			System.out.println("3 - Exit");	
//			System.out.println("Please enter an option.");
//			choice = sc.nextInt();
//			switch(choice)
//			{
//				case 1:
//					System.out.println("How many records would you like to add?");
//					int n = sc.nextInt();
//					people = new Person[n];
//					for(int i = 0; i < people.length; i++)
//					{
//						dao.create(people, i);
//					}
//					break;
//				case 2:
//					System.out.println("Which record would you like to print?");
//					dao.read(people);
//					break;
//				case 3:
//					System.exit(0);
//					break;
//			}
//			
//		} while(choice != 3);
		
		sc.close();
	}
	
}
