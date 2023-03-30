package comparing_students;

import java.util.Comparator;

public class Student {

	// data members
	private int rollNo;
	private String name;
	
	
	// parameterized constructor
	public Student (int rollNo, String name) 
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	
	
	// getters and setters
	public int getRollNo() { return rollNo; }
	public void setRollNo(int rollNo) { this.rollNo = rollNo; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	@Override
	public String toString() { 
		String rollNoAndName = "Roll Number: " + this.rollNo + "\t Name: " + this.name;
		return rollNoAndName;
	}

//	@Override
//	public int compareTo(Student s2) {
//		return this.name.compareTo(s2.name);
//	}


//	@Override
//	public int compare(Student s1, Student s2) {
//		return (s1.getName()).compareTo(s2.getName());
//	}
	
	
	

	
	
	
	
}
