package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Royce", 22);
		map.put("Chris", 23);
		map.put("Koko", 24);
		map.put("Charles", 23);
		
		Set<String> keyset = map.keySet(); // obtain keyset of the map!
		System.out.println("Keyset: " + keyset);
		
//		Collection<Integer> values = map.values(); // obtain the values of the map!
		ArrayList<Integer> values = new ArrayList<Integer>(map.values()); // obtain the values of the map!
		System.out.println("Values: " + values);
		
		for (String key : keyset) 
			System.out.println("Key: " + key + "\tValue: " + map.get(key));	
		
		System.out.println("Set after insertion: ");
		keyset = map.keySet();
		map.put("Test", 123);
		for (String key : keyset) 
			System.out.println("Key: " + key + "\tValue: " + map.get(key));	
		
	}
	
}
