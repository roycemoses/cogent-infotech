package multithreading_demo;

public class MyThread extends Thread {

	MyThread(String s)
	{
		super(s);
	}
	
	@Override
	public void run() {
		System.out.println("Hello! I am thread " + this.getName());
	}
	
}
