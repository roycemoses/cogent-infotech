package auto_wiring_annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

//	@Autowired
	Car car;
		
	@Autowired
	public Person(Car car) {
		this.car = car;
	}
	
	public Car getCar() {
		return car;
	}
	
//	@Autowired
	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
