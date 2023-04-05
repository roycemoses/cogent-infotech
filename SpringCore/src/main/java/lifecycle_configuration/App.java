package lifecycle_configuration;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle_configuration/config.xml");
		Patient patient = (Patient) context.getBean("patient");
		// CONTAINER CALLS setId() AND THEN THE INIT METHOD! 
		System.out.println("Patient ID: #" + patient.getId());
		System.out.println(patient); // Overridden toString() method called
		// Register a shutdown hook named SpringContextShutdownHook with the JVM runtime, 
		// closing this context on JVM shutdown unless it has already been closed at that time. 
		context.registerShutdownHook(); // CONTAINER CALLS THE DESTROY METHOD!
	}

}
