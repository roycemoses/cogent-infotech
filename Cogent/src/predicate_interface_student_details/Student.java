package predicate_interface_student_details;

public class Student {

	private int rollNo;
	private int classNo;
	private String name;
	
	public Student(int rollNo, int classNo, String name)
	{
		this.rollNo = rollNo;
		this.classNo = classNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getClassNo() {
		return classNo;
	}

	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
