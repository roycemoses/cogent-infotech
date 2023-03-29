package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student {

	private ArrayList<String> names;
	
	Student()
	{
		names = new ArrayList<String>();
	}
	
	public void setNames()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many names would you like to insert?");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter the name: ");
			String name = sc.nextLine();
			names.add(name);
		}
		System.out.println("Successfully added all student names!");
	}
	
	public void searchName(String name)
	{
		for (String currName : names)
		{
			if (name.equals(currName))
			{
				System.out.println("Found " + currName + "!");
				return;
			}
		}
		System.out.println("Student does not exist!");
	}
	
	public void searchName(int index)
	{
		if (index < 0 || index >= names.size())
			System.out.println("Error: Index is out of range!");
		else
			System.out.println("Name: " + names.get(index));
	}
	
	public void printNames()
	{
		System.out.println("Printing out all names...");
		Iterator<String> itr = names.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
	}
	
	public void removeName(String name)
	{
		for (int i = 0; i < names.size(); i++)
		{
			if (name.equals(names.get(i)))
			{
				names.remove(i);
				System.out.println("Successfully removed " + name + " from the list!");
				return;
			}
		}
		System.out.println("Failed to find " + name + " in the list!");
	}
	
}
