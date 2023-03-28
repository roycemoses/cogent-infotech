package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try
		{
			fos = new FileOutputStream("D://Users//Rice//Documents//CogentWorkspace//TextFiles//Emp.ser");
			oos = new ObjectOutputStream(fos);
			Employee emp = new Employee(1,"Royce",10000,9999);
			oos.writeObject(emp);
			System.out.println("Object serialized.");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	
}
