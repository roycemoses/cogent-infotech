package spring_movie_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import spring_movie_app.entity.User;
import org.springframework.security.core.userdetails.UserDetails;

@RestController
public class WelcomeController {

	@Autowired
	UserDetailsService user;
	
	@GetMapping("/")
	public String welcome()
	{
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return "Hi, " + userDetails.getUsername() + "! <br><br>"
				+ "Welcome to Royce's movie management web application! <br><br>"
				+ "Go to http://localhost:8080/h2 for database access.<br><br>"
				+ "Admin endpoints: <br>* http://localhost:8080/api/movies<br>"
				+ "* http://localhost:8080/api/movies/id={movieID}<br><br>"
				+ "Thank you for using the program! <br>";
	}
}
