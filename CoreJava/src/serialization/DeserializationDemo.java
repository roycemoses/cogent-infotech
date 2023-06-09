package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("D://Users//Rice//Documents//CogentWorkspace//TextFiles//Emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			Employee emp = (Employee)obj;
			System.out.println("Employee ID: " + emp.id);
			System.out.println("Employee Name: " + emp.name);
			System.out.println("Employee Salary: " + emp.salary);
			System.out.println("Employee SSN: " + emp.ssn);
			fis.close();
			ois.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	
}
