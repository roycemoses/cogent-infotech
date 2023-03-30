package hashmap_demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Student {

	private Map<String, String> empNamesMap;
	
	private Scanner sc = new Scanner(System.in);
	
	Student()
	{
		empNamesMap = new HashMap<String, String>();
	}
	
	public void setNames()
	{
		System.out.println("How many employees would you like to add?");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++)
		{
			System.out.println("ENTER EMPLOYEE " + (i + 1) + " DETAILS");
			System.out.println("Enter the roll number: ");
			String rollNum = sc.nextLine();
			System.out.println("Enter the name: ");
			String name = sc.nextLine();
			empNamesMap.put(rollNum, name);
		}
	}
	
	public void printNames()
	{
		System.out.println("Printing all names...");
		Collection<String> values = this.empNamesMap.values();
		for (String name : values)
			System.out.println(name);
	}
	
	public void getName(String key)
	{
		System.out.println("Obtaining the name for employee #" + key + "...");
		if (empNamesMap.get(key) == null)
			System.out.println("Cannot find employee #" + key + "! Please try again.");
		else
		{
			System.out.println("Found employee #" + key + "!");
			System.out.println("Name: " + empNamesMap.get(key));
		}
	}
	
	public void printNamesKeySet()
	{
		System.out.println("Obtaining keyset...");
		Set<String> keyset = empNamesMap.keySet();
		System.out.println("Keyset:  " + keyset);
	}
	
	public void printSize()
	{
		System.out.println("Size of hashmap: " + empNamesMap.size()); 
	}
	
	public void remove(String key)
	{
		System.out.println("Removing employee #" + key + "...");
		empNamesMap.remove(key);
		System.out.println("Successfully removed!");
	}
	
	
}
