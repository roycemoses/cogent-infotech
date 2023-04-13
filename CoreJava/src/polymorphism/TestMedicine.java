package polymorphism;

import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		
		Medicine[] meds = new Medicine[10];	
		Random rand = new Random();	
		for(int i = 0; i < meds.length; i++)
		{
			int type = rand.nextInt(3) + 1;
			switch (type)
			{
				case 1:
					meds[i] = new Tablet();
					meds[i].setName("Tablet");
					break;
				case 2:
					meds[i] = new Syrup();
					meds[i].setName("Syrup");
					break;
				case 3:
					meds[i] = new Ointment();
					meds[i].setName("Ointment");
					break;
				default:
					// error
			}
			meds[i].setCompanyAddress("Address " + (i + 1));
			System.out.println("DISPLAYING LABEL FOR MEDICINE " + (i+1) + "...");
			meds[i].displayLabel();
			System.out.println();
		}
		
		
		
	}
	
}
