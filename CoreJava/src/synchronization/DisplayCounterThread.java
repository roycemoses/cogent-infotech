package synchronization;

public class DisplayCounterThread extends Thread {

	private static int count = 0;
	
	public synchronized void increment() {
		System.out.println("Thread started with count value: " + count);
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.print(++count);
			System.out.println();
		}
		System.out.println("Thread finished with count value: " + count);
	}
	
	@Override
	public void run() {
		this.increment();
	}
	
	public static void main (String[] args) throws InterruptedException
	{
		DisplayCounterThread thread1 = new DisplayCounterThread();
		DisplayCounterThread thread2 = new DisplayCounterThread();
		
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		
	}
}
