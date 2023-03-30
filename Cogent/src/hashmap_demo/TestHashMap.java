package hashmap_demo;

import java.util.Scanner;

public class TestHashMap {

	public static void main(String[] args) {
		
		Student student = new Student(); 
		Scanner sc = new Scanner(System.in);
		int choice;
		String employeeNum;
		
		do {
			System.out.println(" *************** MENU ***************");
			System.out.println("1 - Set names"); 
			System.out.println("2 - Print names");
			System.out.println("3 - Get name");
			System.out.println("4 - Print names of keyset");
			System.out.println("5 - Print size of map");
			System.out.println("6 - Remove key-value pair");
			System.out.println("7 - Exit");
			System.out.println("Please enter an option:");
			choice = Integer.parseInt(sc.nextLine());
			switch(choice)
			{
				case 1:
					student.setNames();
					break;
				case 2:
					student.printNames();
					break;
				case 3:
					System.out.println("Please enter the employee number: ");
					employeeNum = sc.nextLine();
					student.getName(employeeNum);
					break;
				case 4:
					student.printNamesKeySet();
					break;
				case 5:
					student.printSize();
					break;
				case 6:
					System.out.println("Please enter the employee number you want to remove: ");
					employeeNum = sc.nextLine();
					student.remove(employeeNum);
					break;
				case 7:
					System.exit(0);
					break;
			}
			
		} while(choice != 7);
		
	}
	
}
