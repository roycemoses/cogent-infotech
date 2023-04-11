package one_to_one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import one_to_one.entity.Employee;
import one_to_one.entity.Passport;
import one_to_one.repository.EmployeeRepository;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository repository;
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(OneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setName("Royce");
		employee.setEmail("abc@gmail.com");
		
		Passport passport = new Passport();
		passport.setExpiry("15-07-2024");
		passport.setAddress("New York");
		
		employee.setPassport(passport);
		
		repository.save(employee);
		System.out.println("Employee details are saved successfully!");
		
		System.out.println();
	}

}
