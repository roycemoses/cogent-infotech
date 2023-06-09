package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PersonSerializationDemo {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		char option;
		try
		{
			fos = new FileOutputStream("D://Users//Rice//Documents//CogentWorkspace//TextFiles//Person.ser");
			oos = new ObjectOutputStream(fos);
			
			do
			{
				System.out.println("____ENTER PERSON DETAILS____");
				System.out.println("Roll number:");
				int rollNum = Integer.parseInt(sc.nextLine());
				System.out.println("Name:");
				String name = sc.nextLine();
				System.out.println("Age:");
				int age = Integer.parseInt(sc.nextLine());
				System.out.println("Address:");
				String address = sc.nextLine();
				
				Person person = new Person();
				person.setRollNum(rollNum); 
				person.setName(name); 
				person.setAge(age); person.
				setAddress(address);
				
				oos.writeObject(person);
				System.out.println("Successfully serialized!");
				
				System.out.println("Would you like to add another person record? (Y/N)");
				option = sc.nextLine().charAt(0);
			} while (option == 'Y' || option == 'y');
		}
		catch (NumberFormatException e)
		{
			System.out.println(e);
			System.out.println("Restarting program...");
			main(args);
		}
		catch (CustomBlankFieldException e)
		{
			System.out.println(e);
			System.out.println("Restarting program...");
			main(args);
		}
		System.out.println("Goodbye!");
		
	}
	
}
