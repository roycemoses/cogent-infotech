package linked_list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
	
		List<String> list = new LinkedList<String>();
		list.add("Rice");
		list.add("Royce");
		list.add("Destined");
		list.add("Mission");
		list.add("Destroyer");
		
		System.out.println("List: " + list);
		
		ListIterator<String> itr = list.listIterator();
		System.out.println("Traversing the list in the forward direction...");
		
		while (itr.hasNext())
			System.out.println(itr.next());
		
		while (itr.hasPrevious())
			System.out.println(itr.previous());
		
		
	}
	
}
