package tree_set_demo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		Set<String> products = new TreeSet<String>();
		
		products.add("Coca-cola");
		products.add("Sprite");
		products.add("Mountain Dew");
		products.add("Fanta");
		products.add("Fanta");
		products.add("Zebra");
		
		System.out.println("Printing all products using an iterator...");
		Iterator<String> itr = products.iterator();
		while (itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		
		System.out.println();
		System.out.println();

		int i = 0;
		for (String productName : products)
		{
			if (i == 0)
				System.out.println("First product: " + productName);
			else if (i == products.size() - 1)
				System.out.println("Last product: " + productName);
			i++;
		}
		
		System.out.println();
		
		System.out.println(products);
		System.out.println("Size of tree map (before deletion): " + products.size());
		products.remove("Sprite");
		System.out.println(products);
		System.out.println("Size of tree map (after deletion): " + products.size());
		
		
	}
	
	
}
