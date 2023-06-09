package abstraction_compartment;

import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		
		Compartment[] compartments = new Compartment[10];
		Random rand = new Random();
		
		for (int i = 0; i < compartments.length; i++)
		{
			int option = rand.nextInt(4) + 1;
			switch (option)
			{
				case 1:
					compartments[i] = new FirstClass();
					break;
				case 2:
					compartments[i] = new Ladies();
					break;
				case 3:
					compartments[i] = new General();
					break;
				case 4:
					compartments[i] = new Luggage();
					break;
			}
			compartments[i].notice();
			if (compartments[i] instanceof FirstClass)
				System.out.println("^ FirstClass ^");
			else if (compartments[i] instanceof Ladies)
				System.out.println("^ Ladies ^");
			else if (compartments[i] instanceof General)
				System.out.println("^ General ^");
			else if (compartments[i] instanceof Luggage)
				System.out.println("^ Luggage ^");
		}
		
	}
	
}
