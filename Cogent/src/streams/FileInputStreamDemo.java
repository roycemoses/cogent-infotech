package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		
		FileReader fis = null;
		try {
			fis = new FileReader("D://Users//Rice//Documents//CogentWorkspace//example.txt");
			System.out.println("File is open!");
			int i;
			while ((i=fis.read()) != -1)
			{
				System.out.print((char)i);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
