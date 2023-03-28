package polymorphism;

public class Medicine {

	String name;
	String companyAddress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	
	public void displayLabel() {
		System.out.println("Name - " + this.name);
		System.out.println("Company Address - " + this.companyAddress);
	}
	
	
}
