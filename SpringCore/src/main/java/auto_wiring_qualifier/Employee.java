package auto_wiring_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired
//	@Qualifier("address123")
	@Qualifier("address456")
	private Address address; // specify the bean object you want with the qualifier!

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee[address="+address+"]";
	}
	
}
