package synchronization;

public class DisplayBalance {

	DisplayBalance() {}
	
	public synchronized void showBalance(int balance)
	{
		System.out.println("Balance: " + balance);
	}
	
}
