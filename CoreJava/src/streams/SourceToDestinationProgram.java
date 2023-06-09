package streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class SourceToDestinationProgram {

	public static void main(String[] args) {
		
		if (args.length != 2)
			System.out.println("Please enter a source file (args[0]) and a destination file (args[1])");
		
		String source = args[0];
		String destination = args[1];
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// Check source file
		try 
		{
			fis = new FileInputStream(args[0]);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Source file not found! Please revise args[0].");
			return;
		}
		
		// Check destination file
		boolean destination_exists = new File(args[1]).exists();
		System.out.println("Do you want do overwrite the existing file? Path: " + args[1] + " (Y/N)");
		Scanner sc = new Scanner(System.in);
		char option = sc.nextLine().charAt(0);
		switch (option)
		{
			case 'Y':
				try 
				{
					fis = new FileInputStream(args[0]);
					fos = new FileOutputStream(args[1]);
					int data;
					while ((data=fis.read()) != -1)
					{
						fos.write(data);
					}
					System.out.println("Successfully copied abc.txt to msg.txt!");
					fis.close();
					fos.close();
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
				break;
			case 'N':
				System.out.println("Goodbye!");
				break;
		}
		
	}
	
}
