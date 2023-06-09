package multithreading_demo;

public class ThreadDemo {

	public static void main(String[] args) {
	
		// Demonstration #1 (100 runs)
		for (int i = 0; i < 100; i++)
		{
			MyThread thread1 = new MyThread("Alpha");
			MyThread thread2 = new MyThread("Beta");
			
			thread1.start();
			thread2.start();
		}
		
		// Demonstration #2 (100 runs)
		for (int i = 0; i < 100; i++)
		{
			MyThread thread1 = new MyThread("Alpha");
			MyRunnableThread thread2 = new MyRunnableThread();
			Thread runThread2 = new Thread(thread2);
			
			thread1.start();
			runThread2.start();
		}
		
		// Demonstration #3 (100 runs)
		for (int i = 0; i < 100; i++)
		{
			MyThread thread1 = new MyThread("Alpha");
			MyRunnableThread runnableThread2 = new MyRunnableThread();
			Thread thread2 = new Thread(runnableThread2);
			thread2.setName("Beta");
			
			thread1.setPriority(Thread.MAX_PRIORITY);
			thread2.setPriority(Thread.MIN_PRIORITY);
			
			thread1.start();
			thread2.start();
		}

		
//		thread1.run();
//		thread2.run();
		
	}
	
}
