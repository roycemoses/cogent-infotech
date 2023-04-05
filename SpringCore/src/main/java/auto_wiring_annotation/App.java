package auto_wiring_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("auto_wiring_annotation/config.xml");
		
		Person person = (Person) context.getBean("person");
		Car car = person.getCar();
		
		System.out.println("________ Car Details ________");
		System.out.println("Model: " + car.getModel());
		System.out.println("Price: $" + car.getPrice());
		
				
	}
	
}
