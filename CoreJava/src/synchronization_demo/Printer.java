package synchronization_demo;

public class Printer extends Thread {

	Storage storage;
	
	Printer(Storage storage)
	{
		this.storage = storage;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			storage.printNum();
	}
	
}
