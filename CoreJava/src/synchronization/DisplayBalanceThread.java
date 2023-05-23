package synchronization;

public class DisplayBalanceThread extends Thread {

	DisplayBalance displayBalance;
	static int balance;
	
	public DisplayBalanceThread(DisplayBalance displayBalance) {
		this.displayBalance = displayBalance;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
		{
			balance++;
			displayBalance.showBalance(DisplayBalanceThread.balance);
		}
	}
}
