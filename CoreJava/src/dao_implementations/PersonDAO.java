package dao_implementations;

import java.util.Scanner;

public class PersonDAO {

	Scanner sc = new Scanner(System.in);
	public void create(Person[] people, int i)
	{
		Person p = new Person();
		people[i] = p;
		System.out.println("Enter the ID of person " + (i + 1));
		people[i].setPersonID(sc.nextInt());
		System.out.println("Enter the name of person " + (i + 1));
		people[i].setPersonName(sc.next());
		System.out.println("Enter the address of person " + (i + 1));
		people[i].setPersonAddress(sc.next());
	}
	
	public void read(Person[] people)
	{
		for(Person p:people)
		{
			System.out.println("Person ID: " + p.getPersonID());
			System.out.println("Person name: " + p.getPersonName());
			System.out.println("Person address: " + p.getPersonAddress());
		}
	}
	
	public void update()
	{
		
	}
	
	public void delete()
	{
		
	}
}
