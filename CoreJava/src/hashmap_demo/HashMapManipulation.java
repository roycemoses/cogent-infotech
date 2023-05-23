package hashmap_demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapManipulation {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
//		insert, delete, and retrieve all elements from hashmap
		
		hmap.put(1, "Royce");
		hmap.put(2, "Gyanendra");
		hmap.put(3, "Travis");
		
		hmap.remove(1);
		
		System.out.println("___ HashMap Details ___\n\nKEY : VALUE\n");
		Iterator<Entry<Integer, String>> hmapIterator = hmap.entrySet().iterator();
		while (hmapIterator.hasNext())
		{
			Map.Entry<Integer, String> mapElement = (Map.Entry<Integer, String>)hmapIterator.next();
			System.out.println(mapElement.getKey() + " : " + mapElement.getValue());
		}
		
		hmap.values(); // values
		hmap.keySet(); // keys
		
		
		
	}
	
}
