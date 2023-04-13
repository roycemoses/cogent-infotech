package serialization;

import java.io.Serializable;

public class Person implements Serializable {

	private int rollNum;
	private String name;
	private int age;
	private String address;
	
	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {			
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws CustomBlankFieldException {
		if (name.equals(""))
			throw new CustomBlankFieldException("Error! Name cannot be blank.");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) throws CustomBlankFieldException {
		if (address.equals(""))
			throw new CustomBlankFieldException("Error! Name cannot be blank.");
		this.address = address;
	}
	
	
	
	
}
