package rectangle;
import java.util.Scanner;


public class RectangleTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 5; // number of rectangle objects to instantiate
		
		Rectangle[] rectangles = new Rectangle[n];
		
		for (int i = 0; i < rectangles.length; i++)
		{
			Rectangle r = new Rectangle();
			System.out.println("Please enter the length of rectangle #" + (i+1) + ":");
			r.setLength(Float.parseFloat(sc.nextLine()));
			System.out.println("Please enter the breadth of rectangle #" + (i+1) + ":");
			r.setBreadth(Float.parseFloat(sc.nextLine()));
			rectangles[i] = r;
		}
		
		for (int i = 0; i < rectangles.length; i++)
			rectangles[i].display(i+1);
		
	}
	
}
