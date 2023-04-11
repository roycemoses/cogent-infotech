package spring_book_app;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring_book_app.entity.User;
import spring_book_app.repository.UserRepository;



@SpringBootApplication
public class SpringBookApp {

	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBookApp.class, args);
	}
	
	@PostConstruct
	public void initUser()
	{
		List<User> users = new ArrayList<>();
		users.add(new User(1001,"Royce","abc","abc1@gmail.com"));
		users.add(new User(1002,"Chris","abc","abc2@gmail.com"));
		users.add(new User(1002,"Koko","abc","abc3@gmail.com"));
		userRepository.saveAll(users);
	}

}
