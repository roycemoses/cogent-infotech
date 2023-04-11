package spring_boot_security_app;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring_boot_security_app.entity.User;
import spring_boot_security_app.repository.UserRepository;



@SpringBootApplication
public class SpringBootSecurityApp {

	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityApp.class, args);
	}
	
	@PostConstruct
	public void initUser()
	{
		List<User> users = new ArrayList<>();
		users.add(new User(1001,"Royce","abc^1","abc1@gmail.com"));
		users.add(new User(1002,"Chris","abc^2","abc2@gmail.com"));
		users.add(new User(1002,"Koko","abc^3","abc3@gmail.com"));
		userRepository.saveAll(users); //
	}

}
