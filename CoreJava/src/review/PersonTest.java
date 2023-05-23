package review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTest {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person(1, "d", 22));
		persons.add(new Person(2, "f", 23));
		persons.add(new Person(3, "c", 24));
		persons.add(new Person(4, "a", 25));
		persons.add(new Person(4, "e", 26));
		persons.add(new Person(4, "h", 27));
		persons.add(new Person(4, "g", 28));
		persons.add(new Person(4, "b", 29));
		
		Collections.sort(persons, new PersonComparator());
		
		for (Person person : persons)
			System.out.println(person.name);
	}
	
}
