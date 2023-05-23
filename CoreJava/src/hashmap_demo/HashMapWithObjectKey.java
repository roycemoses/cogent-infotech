package hashmap_demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

class Person {
	
	public int id;
	public String name;
	private int hashCode;
		
	Person(int id, String name) {
		this.hashCode = Objects.hash(id, name);
	};
	
	@Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person that = (Person) o;
        return this.id == that.id;
    }

    @Override
    public int hashCode() {
        return this.hashCode;
    }
	
	
}

public class HashMapWithObjectKey {

	public static void main(String[] args) {
		
		HashMap<Person, String> hmap = new HashMap<Person, String>();
		
		hmap.put(new Person(1, "Royce"), "Admin");
		hmap.put(new Person(2, "Gyanendra"), "Admin");
		hmap.put(new Person(3, "Koko"), "User");
		
		Iterator<Entry<Person, String>> iterator = hmap.entrySet().iterator();
		while (iterator.hasNext())
		{
			Map.Entry<Person, String> mapEntry = (Map.Entry<Person, String>) iterator.next();
			System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());
		}
	}
	
}
