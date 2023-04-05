package hotel_management;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("hotel_management/config.xml");
		
		Customer customer = (Customer) context.getBean("customer");
		Reservation reservation = customer.getReservation();
		
		System.out.println("________ Reservation details for " + customer.getName() + " ________");
		System.out.println("ID: #" + reservation.getId());
		System.out.println("Time: " + reservation.getTime());
		
		
	}
	
}
