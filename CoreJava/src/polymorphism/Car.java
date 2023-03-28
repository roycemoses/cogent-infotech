package polymorphism;

public class Car {
	
	double speed;
	int noOfGears;
	
	public void drive(double speed, int noOfGears) {
		this.speed = speed;
		this.noOfGears = noOfGears;
	}
	
	public void display() {
		System.out.println("Speed: " + this.speed + " mph");
		System.out.println("Number of gears: " + this.noOfGears);
	}
	
}
