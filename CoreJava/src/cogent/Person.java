package cogent;

public class Person {
		
	// data members
	int personID;
	String personFirstName;
	String personLastName;
	int personAge;
	String personAddress;
	
	// default constructor
	public Person() {
		// nothing
	}

	public Person(int personID, String personFirstName, String personLastName,
			int personAge, String personAddress) {
		super();
		this.personID = personID;
		this.personFirstName = personFirstName;
		this.personLastName = personLastName;
		this.personAge = personAge;
		this.personAddress = personAddress;
	}

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public String getPersonFirstName() {
		return personFirstName;
	}

	public void setPersonFirstName(String personFirstName) {
		this.personFirstName = personFirstName;
	}

	public String getPersonLastName() {
		return personLastName;
	}

	public void setPersonLastName(String personLastName) {
		this.personLastName = personLastName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	
	
	
}
