package data_structures_and_algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class FindDuplicate {
	
	public static void main(String[] args) {		
		List<Integer> arr = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 4, 5, 6, 7, 8, 9, 9);
		HashSet<Integer> uniqueValuesOnly = new HashSet<Integer>(arr);
		arr = new ArrayList<Integer>(uniqueValuesOnly);
		System.out.println(arr);
	}

}
