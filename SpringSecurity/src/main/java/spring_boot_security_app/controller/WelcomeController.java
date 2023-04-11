package spring_boot_security_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public String welcome()
	{
		return "We're making a Spring Boot web app using Spring Security!";
	}
	
}
