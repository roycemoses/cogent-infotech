package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EmployeeInputStream {

	public static void main(String[] args) {
		
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("D://Users//Rice//Documents//CogentWorkspace//TextFiles//employee.txt");
			System.out.println("File is open!");
			int i;
			while ((i=fis.read()) != -1)
			{
				System.out.print((char)i);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}		
	}
	
}
