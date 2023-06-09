package inheritance;

public class Application {

	public static void main(String[] args) {
		
		Person p = new Person();
		Address address = new Address();
		address.setHouseNum(191);
		address.setCityName("Rosemead");
		address.setStreetNum(2000);
		
		p.setPersonID(500);
		p.setPersonName("Mary");
		p.setAddress(address);
		
		System.out.println("Person: " + p.getPersonName());
		System.out.println("Person ID: " + p.getPersonID());
		System.out.println("Address house number: " + p.getAddress().getHouseNum());
		System.out.println("Address street number: " + p.getAddress().getStreetNum());
		System.out.println("Address city name: " + p.getAddress().getCityName());
		
	}
	
}
