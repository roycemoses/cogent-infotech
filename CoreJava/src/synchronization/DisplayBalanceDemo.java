package synchronization;

public class DisplayBalanceDemo {

	public static void main(String[] args) {
		
		Thread t1 = new DisplayBalanceThread(new DisplayBalance());
		Thread t2 = new DisplayBalanceThread(new DisplayBalance());
		
		t1.start();
		t2.start();
		try {
			t1.join();
		}
		catch (InterruptedException e) {
			
		}
		
//		t2.start();
		
		
	}
	
}
