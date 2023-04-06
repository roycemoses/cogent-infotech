package book_main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import book_dao.BookDAO;
import book_dao_impl.BookDAOImpl;
import book_pojo_javabean_dto.Book;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("book_main/config.xml");
		BookDAO dao = (BookDAOImpl) context.getBean("BookDAOImpl");
		Scanner sc = new Scanner(System.in);
		Book book;
		int id;
	
		try {
			int choice;
			do {
				System.out.println(" *************** MENU ***************");
				System.out.println("1 - Create books");
				System.out.println("2 - Search for book");
				System.out.println("3 - Read and print all books");
				System.out.println("4 - Update book");
				System.out.println("5 - Delete book");
				System.out.println("6 - Exit");
				System.out.println("Please enter an option:");
				choice = Integer.parseInt(sc.nextLine());
				switch (choice) 
				{
				case 1:
					System.out.println("How many books would you like to create?");
					int n = Integer.parseInt(sc.nextLine());
					for (int i = 0; i < n; i++) 
					{
						try {
							System.out.println("___ENTER NEW BOOK #" + (i + 1) + " DETAILS___");
							System.out.println("Enter the book ID: ");
							id = Integer.parseInt(sc.nextLine());
							System.out.println("Enter the book name: ");
							String name = sc.nextLine();
							System.out.println("Enter the book price: ");
							float price = Float.parseFloat(sc.nextLine());
							book = new Book();
							book.setId(id); book.setName(name); book.setPrice(price);
							dao.create(book);
						} catch (Exception e) {
							System.out.println("An error has occurred! Please enter a valid input!");
							System.out.println("Error details - " + e);
							System.out.println("NOTE: The current book was not added to the list!");
							System.out.println("Would you like to see the current list of books?");
							System.out.println("1 - Yes");
							System.out.println("2 - No");
							try {
								int option = Integer.parseInt(sc.nextLine());
								if (option == 1) {
									System.out.println("\nPrinting all books...\n\n");
									read(dao.read());
								}
								System.out.println("Returning to main menu...");
							} catch (Exception e2) {
								System.out.println("Returning to main menu...");
							}
						}
					}
					break;
				case 2:
					System.out.println("Please enter the book ID to search:");
					id = Integer.parseInt(sc.nextLine());
					read(dao.read(id));
					break;
				case 3:
					System.out.println("Printing all books...\n");
					read(dao.read());
					break;
				case 4:
					System.out.println("Please enter the book ID to update...");
					id = Integer.parseInt(sc.nextLine()); 
					book = dao.read(id);
					System.out.println("Please enter the updated details for book #" + id + "!");
					try {
						System.out.println("Enter the new book name:");
						String name = sc.nextLine();
						System.out.println("Enter the new price: ");
						float price = Float.parseFloat(sc.nextLine());
						
						book.setName(name);
						book.setPrice(price);
						dao.update(book); // write to DB
						
						System.out.println("\nBook #" + id + " has successfully been updated!");
					} catch (Exception e) {
						System.out.println("An error has occurred! Please enter a valid input!");
						System.out.println("Error details - " + e);
						System.out.println("NOTE: The book (#" + id + ") was not updated!");
						System.out.println("Returning to main menu...");
					}
					break;
				case 5:
					System.out.println("Please enter the book ID to delete: ");
					id = Integer.parseInt(sc.nextLine());
					dao.delete(id);
					System.out.println("\nBook #" + id + " has successfully been deleted!");
					break;
				case 6:
					System.exit(0);
				}
			} while (choice != 6);
		} catch (Exception e) {
			System.out.println("An error has occurred!");
			System.out.println("Error details - " + e);
			System.out.println("Restarting the main program...");
			main(args);
		}
		sc.close();
	
	}

	private static void read(List<Book> books) 
	{
		for (Book b : books) 
		{
			System.out.println("PRINTING DETAILS FOR BOOK # " + b.getId() + "...");
			System.out.println("Employee number: " + b.getName());
			System.out.println(
				 String.format("Employee salary: %.2f \n", b.getPrice()));
		}
	}
	
	private static void read(Book book)
	{
		System.out.println("PRINTING DETAILS FOR BOOK # " + book.getId() + "...");
		System.out.println("Employee number: " + book.getName());
		System.out.println(
			 String.format("Employee salary: %.2f \n", book.getPrice()));
	}
	
}
