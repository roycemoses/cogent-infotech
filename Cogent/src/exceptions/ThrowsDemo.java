package exceptions;


class Arithmetic
{
	public void division(int x, int y) throws NumberFormatException
	{
		int z = x / y;
		System.out.println(z);
	}	
}

public class ThrowsDemo {

	public static void main(String[] args) {
		
		new Arithmetic().division(2, 0);
//		try
//		{
//			new Arithmetic().division(2, 0);
//		}
//		catch (ArithmeticException e)
//		{
//			System.out.println("This is a caught exception! Exception: " + e.getMessage());
//		}
//		finally
//		{
//			System.out.println("Finally works!");
//		}
		
	}
	
}
