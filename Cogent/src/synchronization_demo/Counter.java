package synchronization_demo;

public class Counter extends Thread {

	Storage storage;
	
	Counter(Storage storage)
	{
		this.storage = storage;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			storage.incrementNum();
	}
	
}
