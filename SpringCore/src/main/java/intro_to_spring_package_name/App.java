package intro_to_spring_package_name;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args)
    {
    	
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("intro_to_spring_package_name/config.xml");
    	GreetingJavaBean greeting = (GreetingJavaBean) ctx.getBean("hello");
    	String str = greeting.message();
    	System.out.println(str);
    	
    	System.out.println();
    	
    	EmployeeBean employee = (EmployeeBean) ctx.getBean("employee");
    	System.out.println("Employee number: " + employee.getId());
    	System.out.println("Employee name: " + employee.getName());

    	System.out.println();
    	
    	PersonBean person = (PersonBean) ctx.getBean("person");
    	System.out.println("Person id: " + person.getId());
    	System.out.println("Person name: " + person.getName());
    	System.out.println("Person age: " + person.getAge());
    	System.out.println("Person address: " + person.getAddress());
    	
    	System.out.println();
    	
    	Hospital hospital = (Hospital) ctx.getBean("hospital");
    	System.out.println("Hospital name: " + hospital.getName());
    	System.out.println("Hospital department: " + hospital.getDepartment());
    	System.out.println("Hospital department class type?: " + hospital.getDepartment().getClass());
    	System.out.println("Hospital people (List<Object> / List<Person>): " + hospital.getPeople());
    	System.out.println("Hospital person 1 name: " + hospital.getPeople().get(0).getName());
    	System.out.println("Hospital person 2 name: " + hospital.getPeople().get(1).getName());
    	
    	System.out.println();
    	
    	Customer customer = (Customer) ctx.getBean("customer");
    	System.out.println("Customer ID: " + customer.getId());
    	System.out.println("Customer products: " + customer.getProducts());
    	Map<Integer, String> customerProducts = customer.getProducts();
    	System.out.println("Customer products (key = 1001): " + customerProducts.get(1001));
    	System.out.println("Customer products Key Set: " + customerProducts.keySet());
    	System.out.println("Customer products Values: " + customerProducts.values());
    	
    	System.out.println();
    	
    	CarDealer carDealer = (CarDealer) ctx.getBean("cardealer");
    	System.out.println("Car dealer name: " + carDealer.getName());
    	System.out.println("Car dealer models: " + carDealer.getModels());
    	System.out.println("Car dealer models class type?: " + carDealer.getModels().getClass());
    	
    	System.out.println();
    	Student student = (Student) ctx.getBean("student");
    	System.out.println(student);
    	
    }
}
