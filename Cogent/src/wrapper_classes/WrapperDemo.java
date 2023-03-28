package wrapper_classes;

public class WrapperDemo {

	public static void main(String[] args) {
		
//		int x = 100; // primitive
//		Integer y = Integer.valueOf(x); // boxing
//		int z = y.intValue(); // unboxing
//		
//		System.out.println(y.getClass().getName());
		
//		byte x = 100;
//		String s = Byte.toString(x); // boxing
//		byte z = Byte.parseByte(s); // unboxing
		
		long x = 1000;
		Long y = Long.valueOf(x);
		String s = Long.toString(y);
		Long z = Long.valueOf(s);
		long l = Long.parseLong(s);
		System.out.println(l);
		
		

	}
	
}
