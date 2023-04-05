package auto_wiring_xml;

public class Person {

	Car car;
	Address address;
		
	public Person(Car car, Address address) {
		this.car = car;
		this.address = address;
	}
	
	public Car getCar() {
		return car;
	}
//	public void setCar(Car car) {
//		this.car = car;
//	}
	public Address getAddress() {
		return address;
	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
	
	
	
}
