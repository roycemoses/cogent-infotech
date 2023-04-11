package one_to_many;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import one_to_many.entity.Course;
import one_to_many.entity.Student;
import one_to_many.repository.StudentRepository;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student("Royce Moses");
		Course course1 = new Course("Hello, this is course 1!", 1.11f);
		Course course2 = new Course("Hi, this is course 2!", 2.22f);
		Course course3 = new Course("Hey, this is course 3!", 3.33f);
		student.getCourses().add(course1);
		student.getCourses().add(course2);
		student.getCourses().add(course3);
		studentRepository.save(student);
		System.out.println("Student with courses has been added!");
	}

}
