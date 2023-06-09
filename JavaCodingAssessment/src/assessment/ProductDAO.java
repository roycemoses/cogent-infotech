package assessment;

import java.util.Scanner;

public class ProductDAO {

	Scanner sc = new Scanner(System.in);
	public void create(Product[] products, int i)
	{
		Product product = new Product();
		products[i] = product;
		System.out.println("Enter the ID of Product #" + (i + 1));
		products[i].setId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the name of Product #" + (i + 1));
		products[i].setName(sc.nextLine());
		System.out.println("Enter the price of Product #" + (i + 1));
		products[i].setPrice((Float.parseFloat(sc.nextLine())));
	}
	
	public void read(Product[] products)
	{
		if (products == null) return;
		for(Product product:products)
		{
			if (product == null)
				continue;
			System.out.println("Product ID: " + product.getId());
			System.out.println("Product name: " + product.getName());
			System.out.println(String.format("Product price: %.2f", product.getPrice()));
			System.out.println();
		}
	}
	
	public void update(Product[] products, int productID)
	{
		int currProductIndex = findProductIndex(products, productID);
		
		if (currProductIndex == -1)
		{
			System.out.println("Product #" + productID + " does not exist. Returning to main menu...");
			return;
		}
		
		System.out.println("Please enter the updated details for Product #" + productID + "!");
		
		int option = 0;
		do {
			System.out.println("What details would you like to update for Product #" + productID + "?");
			System.out.println("1. Update ID");
			System.out.println("2. Update name");
			System.out.println("3. Update price");
			option = Integer.parseInt(sc.nextLine());
		} while (option <= 0 || option >= 4);
		
		switch (option)
		{
			case 1:
				System.out.println("Enter the new ID:");
				products[currProductIndex].setId(Integer.parseInt(sc.nextLine()));
				break;
				
			case 2:
				System.out.println("Enter the new name:");
				products[currProductIndex].setName(sc.nextLine());
				break;
				
			case 3:
				System.out.println("Enter the new price:");
				products[currProductIndex].setPrice(Float.parseFloat(sc.nextLine()));
				break;
				
			default:
				System.out.println("Error: undefined option");
				System.exit(1);
				break;
		}
		
		System.out.println("\nProduct #" + productID + " has successfully been updated.");
	}
	
	public void delete(Product[] products, int productID)
	{
		int currProductIndex = findProductIndex(products, productID);
		if (currProductIndex == -1)
		{
			System.out.println("Product #" + productID + " does not exist. Returning to main menu...");
			return;
		}
		products[currProductIndex] = null;
		System.out.println("\nProduct #" + productID + " has successfully been deleted.");
	}
	
	private int findProductIndex(Product[] products, int productID)
	{
		int index = -1;
		if (products == null) return index;
		for(int i = 0; i < products.length; i++)
		{
			if (products[i] == null)
				continue;
			if (products[i].getId() == productID)
				index = i;
		}
		return index;
	}
}
