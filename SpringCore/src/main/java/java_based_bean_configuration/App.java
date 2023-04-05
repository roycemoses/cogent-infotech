package java_based_bean_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Person person = (Person) context.getBean("person");
		System.out.println("Person ID: #" + person.getId());
		System.out.println("Person Name: " + person.getName());
		System.out.println("Person Age: " + person.getAge());
		
		System.out.println();
		
		Product product = (Product) context.getBean("product");
		System.out.println("Product ID: #" + product.getId());
		System.out.println("Product Name: " + product.getName());
		System.out.println("Product Price: $" + product.getPrice());
		
	}
	
}
