package access_modifiers;

class Student
{
	private static int age;
		
	static { age = 20; }
	
	public static void setAge(int age) // static methods can only access static members of the same class
	{
		Student.age = age;
	}
	
	public static int getAge()
	{
		return Student.age;
	}
}


public class StaticDemo {

//	private static int age; // variable that always belongs to the class
//	
//	public void setAge(int age)
//	{
//		this.age = age;
//	}
//	
//	public int getAge()
//	{
//		return this.age;
//	}
	
	public static void main(String[] args) {		
//		StaticDemo st1 = new StaticDemo();
//		st1.setAge(40);
//		StaticDemo st2 = new StaticDemo();
//		System.out.println(st2.getAge()); // it's 40! because age was set to 40. age belongs to all objects of the class StaticDemo
//		
//		Student.setAge(24);
		System.out.println(Student.getAge());
		
	}
	
}
