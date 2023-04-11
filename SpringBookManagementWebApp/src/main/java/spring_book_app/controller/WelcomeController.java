package spring_book_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class WelcomeController {

	@Autowired
	UserDetailsService user;
	
	@GetMapping("/")
	public String welcome()
	{
		return "Welcome to Royce's book management web application! \n\nGo to http://localhost:8080/h2 for database access.\n";
	}
	
//	@GetMapping("/")
//	public RedirectView localRedirect() {
//	    RedirectView redirectView = new RedirectView();
//	    redirectView.setUrl("http://localhost:8080/h2");
//	    return redirectView;
//	}
	
}
