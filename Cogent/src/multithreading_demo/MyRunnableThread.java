package multithreading_demo;

public class MyRunnableThread implements Runnable {

	MyRunnableThread()
	{
		super();
	}
	
	public void run() {
		System.out.println("Hello! I am a runnable thread!");
	}
	
}