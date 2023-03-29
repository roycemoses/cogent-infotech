package collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setNames();
		s.searchName("Royce");
		s.searchName("Charles");
		s.searchName(1);
		s.printNames();
		s.removeName("Royce");
		s.printNames();
		
	}
	
}
