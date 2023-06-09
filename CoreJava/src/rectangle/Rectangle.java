package rectangle;

public class Rectangle {

	// Data members (attributes)
	private float length;
	private float breadth;
	
	// Default Constructor
	public Rectangle() { this.length = 0; this.breadth = 0; }
	// Parameterized Constructor
	public Rectangle(float l, float b) { this.length = l; this.breadth = b; }
	
	// Accessor & Mutator methods (Getters & Setters)
	public float getLength() { return length; }
	public void setLength(float length) { this.length = length; }
	public float getBreadth() { return breadth; }
	public void setBreadth(float breadth) { this.breadth = breadth; }
	
	// Public methods (functions)
	// Calculate area method
	public float calculateArea() { return this.length * this.breadth; }
	// Displays all information of the Rectangle object
	public void display(int rectangleNumber)
	{
		System.out.println("_____ Rectangle #" + rectangleNumber + " Details _____");
		System.out.println("Length: " + this.length);
		System.out.println("Breadth: " + this.breadth);
		System.out.println("Area: " + this.calculateArea());
	}
	
}
