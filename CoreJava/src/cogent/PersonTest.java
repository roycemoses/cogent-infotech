package cogent;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		
		
		Person p1 = new Person(); // default constructor, then using setters
		p1.setPersonID(1001);
		p1.setPersonFirstName("Mary");
		p1.setPersonLastName("Jane");
		p1.setPersonAge(25);
		p1.setPersonAddress("New York");
		
		System.out.println("__Person 1 details__");
		System.out.println("Person ID: " + p1.getPersonID());
		System.out.println("First name: " + p1.getPersonFirstName());
		System.out.println("Last name: " + p1.getPersonLastName());
		System.out.println("Age: " + p1.getPersonAge());
		System.out.println("Address: " + p1.getPersonAddress());
		
		Person p2 = new Person(1002, "John", "Smith", 36, "Boston"); // parameterized constructor
		
		System.out.println("__Person 2 details__");
		System.out.println("Person ID: " + p2.getPersonID());
		System.out.println("First name: " + p2.getPersonFirstName());
		System.out.println("Last name: " + p2.getPersonLastName());
		System.out.println("Age: " + p2.getPersonAge());
		System.out.println("Address: " + p2.getPersonAddress());
		
		Person p3 = new Person(); // default constructor, user input, then using setters
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the ID of person 3");
		p3.setPersonID(sc.nextInt());
		System.out.println("Please enter the first name of person 3");
		p3.setPersonFirstName(sc.next());
		System.out.println("Please enter the last name of person 3");
		p3.setPersonLastName(sc.next());
		System.out.println("Please enter the age of person 3");
		p3.setPersonAge(sc.nextInt());
		System.out.println("Please enter the address: ");
		p3.setPersonAddress(sc.next());
		
		System.out.println("__Person 3 details__");
		System.out.println("Person ID: " + p3.getPersonID());
		System.out.println("First name: " + p3.getPersonFirstName());
		System.out.println("Last name: " + p3.getPersonLastName());
		System.out.println("Age: " + p3.getPersonAge());
		System.out.println("Address: " + p3.getPersonAddress());
		
		
		
	}
}
