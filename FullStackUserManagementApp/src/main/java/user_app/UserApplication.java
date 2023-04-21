package user_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import user_app.entity.User;
import user_app.repository.UserRepository;

@SpringBootApplication
public class UserApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Royce", 22, 4900));
		userRepository.save(new User("Chris", 22, 5500));
		userRepository.save(new User("Koko", 24, 4350));
		
	}

}
