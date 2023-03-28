package assessment;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Product[] products = null;
		ProductDAO dao = new ProductDAO();
		int choice = 0;
		int productID = 0;
		do {
			System.out.println(" *************** MENU ***************");
			System.out.println("1 - Add product"); 
			System.out.println("2 - Print all products");
			System.out.println("3 - Update product");
			System.out.println("4 - Delete product");
			System.out.println("5 - Exit");	
			System.out.println("Please enter an option:");
			choice = Integer.parseInt(sc.nextLine());
			switch(choice)
			{
				case 1:
					System.out.println("How many products would you like to add?");
					int n = Integer.parseInt(sc.nextLine());
					products = new Product[n];
					for(int i = 0; i < products.length; i++)
						dao.create(products, i);
					break;
				case 2:
					System.out.println("PRINTING ALL PRODUCTS...");
					System.out.println("");
					dao.read(products);
					break;
				case 3:
					System.out.println("Please enter the product ID of the product you want to update:");
					productID = Integer.parseInt(sc.nextLine());
					dao.update(products, productID);
					break;
				case 4:
					System.out.println("Please enter the Product ID of the Product you want to delete:");
					productID = Integer.parseInt(sc.nextLine());
					dao.delete(products, productID);
					break;
				case 5:
					System.out.println("Thank you. Goodbye!");
					System.exit(0);
					break;
			}
			
		} while(choice != 5);
		
		sc.close();
		
	}
	
}
