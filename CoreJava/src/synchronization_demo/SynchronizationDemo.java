package synchronization_demo;

public class SynchronizationDemo {

	public static void main(String[] args) 
	{
		Storage storage = new Storage();
		Counter counter = new Counter(storage);
		Printer printer = new Printer(storage);
		
		counter.start();
		printer.start();	
		
	}
	
}
