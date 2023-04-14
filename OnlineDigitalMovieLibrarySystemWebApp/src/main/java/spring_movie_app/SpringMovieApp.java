package spring_movie_app;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import spring_movie_app.entity.User;
import spring_movie_app.repository.UserRepository;



@SpringBootApplication
public class SpringMovieApp {

	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMovieApp.class, args);
	}
	
	@PostConstruct
	public void initUser()
	{
		List<User> users = new ArrayList<>();
		users.add(new User(1001,"admin","admin","admin.com"));
		userRepository.saveAll(users);
	}

}
