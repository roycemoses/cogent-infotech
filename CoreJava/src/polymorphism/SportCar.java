package polymorphism;

public class SportCar extends Car {
	
	String AirBalloonType;

	public String getAirBalloonType() {
		return AirBalloonType;
	}

	public void setAirBalloonType(String airBalloonType) {
		AirBalloonType = airBalloonType;
	}
	
	public void AirBalloonType() {
		super.display();
	}
	
	public void display() {
		super.display();
		System.out.println("Air Balloon Type: " + this.AirBalloonType);
	}
	
	
}
