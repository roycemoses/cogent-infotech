package synchronization;

public class DisplayMessageDemo {

	public static void main(String[] args) {
		
		DisplayMessage dm = new DisplayMessage();
		DisplayMessage dm2 = new DisplayMessage();
		MyThread t1 = new MyThread(dm, "Steve");
		MyThread t2 = new MyThread(dm2, "Mark");
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		t2.start();
		
	}
	
}
