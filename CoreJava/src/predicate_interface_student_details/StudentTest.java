package predicate_interface_student_details;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StudentTest {

	public static void main(String[] args) {
		
		Student st1 = new Student(1, 4, "John");
		Student st2 = new Student(2, 4, "James");
		List<Student> students = Arrays.asList(st1, st2);
		
		Predicate<Integer> predicate = (i) -> (i == 2);
		
		for (Student student: students)
			if (predicate.test(student.getRollNo()))
				System.out.println(student.getName());
	}
	
}
