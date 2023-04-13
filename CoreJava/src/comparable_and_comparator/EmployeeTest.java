package comparable_and_comparator;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {

	public static void main(String[] args) {
		
		// COMPARATOR in java.util
		// COMPARABLE in java.lang
		
//		Set<Employee> set = new TreeSet<Employee>(new EmployeeNameComparator());
		Set<Employee> set = new TreeSet<Employee>();
		
		set.add(new Employee(100, "B"));
		set.add(new Employee(400, "C"));
		set.add(new Employee(300, "D"));
		set.add(new Employee(200, "A"));
		
		for (Employee employee : set)
		{
			System.out.println(employee.id + " " + employee.name);
		}
		
	}
	
}