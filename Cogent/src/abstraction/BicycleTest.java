package abstraction;

public class BicycleTest {

	public static void main(String[] args) {
		ACMEBicycle b = new ACMEBicycle();
		b.display();
		
		b.changeCadence(10);
		b.changeGear(42);
		b.speedUp(49);
		b.display();
	}
	
}
