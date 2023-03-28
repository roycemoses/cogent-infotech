package pkg_test;

import esg.itp.shape.*;

public class ShapeTest {

	public static void main(String[] args) {
		
		Square square = new Square(5f);
		Rectangle rectangle = new Rectangle(2f, 4f);
		
		square.calcArea();
		square.calcPeri();
		rectangle.calcArea();
		rectangle.calcPeri();
		
		square.display();
		rectangle.display();
		
	}
	
}
