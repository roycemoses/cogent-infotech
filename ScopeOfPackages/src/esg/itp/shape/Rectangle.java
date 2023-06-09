package esg.itp.shape;

public class Rectangle implements Polygon {

	private float length;
	private float breadth;
	private float area;
	private float perimeter;
	
	public Rectangle(float l, float b) { this.length = l; this.breadth = b; }
	
	public void calcArea() { this.area = this.length * this.breadth; }
	
	public void calcPeri() { this.perimeter = length*2 + breadth*2; }
	
	public void display() 
	{
		System.out.println("___Rectangle___");
		System.out.println("Area: " + this.area);
		System.out.println("Perimeter: " + this.perimeter);
	}
	
}
