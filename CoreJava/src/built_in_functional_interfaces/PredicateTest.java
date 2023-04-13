package built_in_functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Royce", "Chris", "Charles", "Chelsea", "Kangmin", "Koko");
		Predicate<String> predicate = (s) -> (s.startsWith("Ch"));
		
		for (String name : names)
		{
			if (predicate.test(name))
				System.out.println(name);
		}
		
	}
	
}
