package movie_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@Autowired
	UserDetailsService user;
	
	@RequestMapping("/")
	public String home()
	{
		return "Home page";
	}
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "Welcome to Royce's movie web application! \n\nGo to http://localhost:8080/h2 for database access.\n";
	}
	
	
}
