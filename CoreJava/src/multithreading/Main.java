package multithreading;

class MyThread extends Thread
{
	MyThread()
	{
		super("Demo Thread");
		System.out.println("The child thread: " + this);
		this.start();
	}
	
	@Override
	public void run()
	{
		for (int i = 5; i > 0; i--)
		{
			System.out.println("Child thread: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Exiting the child thread!");
	}
	
}

public class Main {
	
	public static void main(String[] args) {
		
		new MyThread();
		for (int i = 5; i > 0; i--)
		{
			System.out.println("Main thread: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Exiting the main thread!");
	}

//class MyThread implements Runnable
//{
//	public void run()
//	{
//		for (int i = 0; i <= 10; i++)
//		{
//			System.out.println("i: " + i + '\t');
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println(e);
//			}
//		}
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		MyThread mt = new MyThread();
//		Thread th = new Thread(mt);
//		th.start();
//		
//		for (int j = 0; j <= 10; j++)
//		{
//			System.out.println("j: " + j + '\t');
//		}
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			System.out.println(e);
//		}
//		
//	}
	
}
