package serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonDeserializationDemo {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try 
		{
			fis = new FileInputStream("D://Users//Rice//Documents//CogentWorkspace//TextFiles//Person.ser");
			ois = new ObjectInputStream(fis);

			for (;;)
			{
				Object obj = ois.readObject();
				Person person = (Person)obj;
				System.out.println("Person Roll Number: " + person.getRollNum());
				System.out.println("Person Name: " + person.getName());
				System.out.println("Person Age: " + person.getAge());
				System.out.println("Person Address: " + person.getAddress());
				System.out.println();
			}
			
		} 
		catch (EOFException e) 
		{
			System.out.println();
			System.out.println("Reached the end of file! Successfully read all objects!");
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally 
		{
			try 
			{
				fis.close();
				ois.close();
			} 
			catch (IOException e) 
			{
				System.out.println(e);
			}
		}
		
	}
	
}
