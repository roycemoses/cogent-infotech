package inner_bean_and_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("inner_bean_and_scope/config.xml");
		Employee employee1 = (Employee) context.getBean("employee");
		System.out.println(employee1.hashCode());
		
		Employee employee2 = (Employee) context.getBean("employee");
		System.out.println(employee2.hashCode()); 
		// if hashcodes are the same, they're the same object.
		// scope: singleton, hashcode will be the same
		// scope: prototype, hashcode will be different!
	}
	
}
