package garbage_collection;

public class GCDemo {

	int objId;
	GCDemo(int objId)
	{
		this.objId=objId;
		
		System.out.println("Created: " + this.objId);
	}
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) // creates 100 objects in the heap;
		{
			new GCDemo(i); // UNREACHABLE
			System.gc();
		}
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized: " + this.objId);
	}
	
}
