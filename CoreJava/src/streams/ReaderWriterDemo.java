package streams;

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderWriterDemo {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;

		try 
		{
			fr = new FileReader("D://Users//Rice//Documents//CogentWorkspace//TextFiles//abc.txt");
			fw = new FileWriter("D://Users//Rice//Documents//CogentWorkspace//TextFiles//msg.txt");
			int ch;
			while ((ch=fr.read()) != -1)
			{
				fw.write(ch);
			}
			System.out.println("Successfully copied abc.txt to msg.txt!");
			fr.close();
			fw.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}
