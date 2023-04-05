package lifecycle_employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java_based_bean_configuration.BeanConfiguration;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle_employee/config.xml");
		Employee employee = (Employee) context.getBean("employee");
		// CONTAINER CALLS setId() AND THEN THE INIT METHOD! 
		System.out.println(employee); // Overridden toString() method called
		// Register a shutdown hook named SpringContextShutdownHook with the JVM runtime, 
		// closing this context on JVM shutdown unless it has already been closed at that time. 
		context.registerShutdownHook(); // CONTAINER CALLS THE DESTROY METHOD!
		
	}

}
