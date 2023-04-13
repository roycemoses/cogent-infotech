package abstraction;

public class BankTest {
	public static void main(String[] args) {
		
		Bank bank = new SBIBank();
		System.out.println(bank.getRateOfInterest());
		
		bank = new HDFCBank();
		System.out.println(bank.getRateOfInterest());
	}
}
