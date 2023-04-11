package spring_boot_intro.greeting;

import org.springframework.stereotype.Component;

@Component
public class Greeting {
	
	public String hello()
	{
		return "\n\nhello!";
	}
	
}
