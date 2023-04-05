package university;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import required_properties_in_bean.Prescription;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("university/config.xml");
		University university1 = (University) ctx.getBean("university");
		System.out.println(university1);
		System.out.println(university1.hashCode());
		
		University university2 = (University) ctx.getBean("university");
		System.out.println(university2);
		System.out.println(university2.hashCode());
		
		
	}
	
}
