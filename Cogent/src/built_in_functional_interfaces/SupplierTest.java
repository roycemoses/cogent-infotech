package built_in_functional_interfaces;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Random rand = new Random();
		Supplier<Integer> randomValue = () -> rand.nextInt(10);
		System.out.println(randomValue.get());
	}
	
}
