package auto_wiring_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("auto_wiring_xml/config.xml");
		Person person = (Person) context.getBean("person");
		Car car = person.getCar();
		Address address = person.getAddress();
		
		System.out.println("________ Address ________");
		System.out.println("House Number: #" + address.getHouseNo());
		System.out.println("Street: " + address.getStreet());
		System.out.println("City: " + address.getCity());
		
		System.out.println("________ Car Details ________");
		System.out.println("Model: " + car.getModel());
		System.out.println("Price: $" + car.getPrice());
		
		
		
		
	}

}
