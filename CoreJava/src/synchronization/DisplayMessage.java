package synchronization;

public class DisplayMessage {

	public synchronized void sayHello(String name)
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("How are you, " + name + " ?");
			System.out.print(Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
}
