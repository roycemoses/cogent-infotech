package comparing_students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortDemo {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "B"));
		students.add(new Student(5, "A"));
		students.add(new Student(4, "C"));
		students.add(new Student(2, "D"));
		students.add(new Student(3, "E"));
		
		for (int i = 0; i < students.size(); i++)
			System.out.println(students.get(i));
		
		// sort by name
		students.sort(new StudentNameComparator());
		
		System.out.println();
		
		for (int i = 0; i < students.size(); i++)
			System.out.println(students.get(i));
		
		
	}
	
	
}
