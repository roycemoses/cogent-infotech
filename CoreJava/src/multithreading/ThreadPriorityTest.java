package multithreading;

public class ThreadPriorityTest extends Thread{

	public static void main(String[] args) {
		
		ThreadPriorityTest thread = new ThreadPriorityTest();
		thread.setPriority(MAX_PRIORITY);
		thread.setName("Rice1");
		thread.start();
		
		ThreadPriorityTest thread2 = new ThreadPriorityTest();
		thread2.setPriority(MIN_PRIORITY);
		thread2.setName("Rice2");
		thread2.start();
		
	}
	
	@Override
	public void run()
	{
		System.out.println("Thread name: " + Thread.currentThread().getName());
	}
	
}
