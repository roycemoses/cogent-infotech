package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class EmployeeCopyFileDemo {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("D://Users//Rice//Documents//CogentWorkspace//TextFiles//employee.txt");
			fos = new FileOutputStream("D://Users//Rice//Documents//CogentWorkspace//TextFiles//new_employee.txt");
			int data;
			while ((data = fis.read()) != -1)
			{ 
				fos.write(data);
			}
			System.out.println("Data from employee.txt copied to new_employee.txt");
			fis.close();
			fos.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}
