package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.drive(200, 6);
		c1.display();
		
		SportCar c2 = new SportCar();
		c2.drive(200, 6);
		c2.setAirBalloonType("Type 1");
		c2.AirBalloonType();
		c2.display();
		
		
		
		
		
//		Person p;
//		p = new Person();
//		p.setName("John");
//		p.interact();
//		
//		p = new Parent();
//		p.setName("John");
//		p.interact();
//		
//		p = new Wife();
//		p.setName("John");
//		p.interact();
//		
//		p = new Child();
//		p.setName("John");
//		p.interact();
//		
//		p = new Colleague();
//		p.setName("John");
//		p.interact();
		
		
		
	}
	
}
