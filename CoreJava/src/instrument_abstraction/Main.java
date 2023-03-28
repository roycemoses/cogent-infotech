package instrument_abstraction;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
	
// 		cannot instantiate Instrument object
//		Instrument instrument = new Instrument();
		
		Instrument[] instruments = new Instrument[10];
		Random rand = new Random();
		int option = 0;
		
		for (int i = 0; i < instruments.length; i++)
		{
			option = rand.nextInt(3) + 1;
			switch (option)
			{
				case 1:
					instruments[i] = new Piano();
					break;
				case 2:
					instruments[i] = new Flute();
					break;
				case 3:
					instruments[i] = new Guitar();
					break;
			}
			instruments[i].play();
			if (instruments[i] instanceof Piano)
				System.out.println(" ^ Piano ^");
			else if (instruments[i] instanceof Flute)
				System.out.println(" ^ Flute ^");
			else if (instruments[i] instanceof Guitar)
				System.out.println(" ^ Guitar ^");
		}
		
		
		
		
		
	}
}
