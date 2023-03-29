package synchronization_demo;

public class Storage {

	private int num;
	boolean valueSet;
	
	synchronized int printNum()
	{
		while (!valueSet)
		{
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				System.out.println("InterruptedException caught");
			}
		}
		System.out.println("Consumed: " + num);
		valueSet = false;
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			System.out.println("InterruptedException caught");
		}
		notify();
		return num;
	}

	synchronized void incrementNum() 
	{
		while (valueSet)
		{
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				System.out.println("InterruptedException caught");
			}
		}
		this.num++;
		valueSet = true;
		System.out.println("Incremented the storage number!");
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			System.out.println("InterruptedException caught");
		}
		notify();
	}
	
}
