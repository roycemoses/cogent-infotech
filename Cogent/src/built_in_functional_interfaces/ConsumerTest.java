package built_in_functional_interfaces;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		
		Consumer<String> consumer = (x) -> System.out.println(x.toLowerCase());
		consumer.accept("HELLO WORLD");
		
	}
	
}
