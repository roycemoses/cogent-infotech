package intro_to_spring_package_name;

import java.util.List;

public class Hospital {

	private String name;
	private List<String> department;
	private List<PersonBean> people;
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public List<String> getDepartment() { return department; }
	public void setDepartment(List<String> department) { this.department = department; }
	public List<PersonBean> getPeople() { return people; }
	public void setPeople(List<PersonBean> people) { this.people = people; }
	
	
}

