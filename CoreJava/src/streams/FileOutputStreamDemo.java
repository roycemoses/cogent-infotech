package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("D://Users//Rice//Documents//CogentWorkspace//TextFiles//abc.txt");
			fos = new FileOutputStream("D://Users//Rice//Documents//CogentWorkspace//TextFiles//xyz.txt");
			int data;
			while ((data = fis.read()) != -1)
			{ 
				fos.write(data);
			}
			System.out.println("Data from abc.txt copied to xyz.txt");
			fis.close();
			fos.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}
