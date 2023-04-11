package spring_boot_intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import spring_boot_intro.greeting.Greeting;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
		Greeting greeting = context.getBean(Greeting.class);
		String msg = greeting.hello();
		System.out.println(msg);
	}

}
