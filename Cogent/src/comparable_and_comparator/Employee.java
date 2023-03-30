package comparable_and_comparator;

public class Employee implements Comparable<Employee> {

	public int id;
	public String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Employee emp2)
	{
		// sort the set based on the id!
//		int id1 = this.id;
//		int id2 = emp2.id;
//		if (id1 < id2)
//			return -1;
//		else if (id1 > id2)
//			return 1;
//		else
//			return 0;
		
		// sort the set based on the name!
		String name1 = this.name;
		String name2 = emp2.name;
		return name1.compareTo(name2);
	}	
	
	
}
