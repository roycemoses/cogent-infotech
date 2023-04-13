package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// important methods of ArrayList
		List<Integer> l = new ArrayList<Integer>();
		
		for (int i = 10; i <= 100; i+=10)
		{
			l.add(i);						
		}
		System.out.println("List (before 2-param insertion): ");
		System.out.println(l);
		
		l.add(2, 100); // Add, at index 2, value 100
		
		System.out.println("List (after 2-param insertion): ");
		System.out.println(l);

		l.set(3, 500); // Set, at index 3, value 500
		
		System.out.println("List (after set/replacement): ");
		System.out.println(l);
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(191);
		l2.add(244);
		l2.add(358);
		System.out.println("List 2: ");
		System.out.println(l2);
		
		l.addAll(4, l2); // Add all, at index 4, the elements in l2
		System.out.println(l);
		
		if (l.contains(90))
			System.out.println("l contains 90");
		else
			System.out.println("l does not contain 90");
		
		l.remove(0); // Remove, at index 0
		System.out.println("List (after deletion): ");
		System.out.println(l);
		
		
		
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
////		ArrayList al = new ArrayList();
//		al.add(new Integer(2));
//		al.add(new Integer(4));
//		al.add(5); // auto boxing
////		System.out.println(al.get(0));
////		System.out.println(al.get(1));
////		System.out.println(al.get(2));
////		al.add("Cogent");
////		al.add("Infotech");
////		
//		
//		for (int i = 0; i < al.size(); i++)
//		{
//			System.out.print(al.get(i));
//		}
//		System.out.println();
//		
//		for (Object object : al)
//		{
////			String str = object.toString();
////			int a = Integer.parseInt(str);
//			System.out.print(object.toString());
//		}
//		System.out.println();
//		
//		Iterator<Integer> int_iterator = al.iterator();
//		while (int_iterator.hasNext())
//		{
//			System.out.print(int_iterator.next());
//		}
//		System.out.println();
	}
	
}
