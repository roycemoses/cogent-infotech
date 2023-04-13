package set;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Random obj = new Random();
//		Set<Integer> set = new HashSet<Integer>(); // unordered
//		Set<Integer> set = new LinkedHashSet<Integer>(); // maintains insertion order
		Set<Integer> set = new TreeSet<Integer>(); // maintains natural sorted order
		set.add(100);
		set.add(500);
		set.add(200);
		set.add(140);
		set.add(30);
		set.add(1);
		set.add(1); // attempt to add duplicate won't do anything
		
		System.out.println("Set: " + set);
		
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

//		Set<String> set = new TreeSet<String>();
//		set.add(new String("abc"));
//		set.add(new String("xyz"));
//		set.add(new String("def"));
//		set.add(new String("mno"));
//		System.out.println("Set: " + set);
//		for (String str : set)
//		{
//			System.out.println(str);
//		}
				
		
	}
	
}
