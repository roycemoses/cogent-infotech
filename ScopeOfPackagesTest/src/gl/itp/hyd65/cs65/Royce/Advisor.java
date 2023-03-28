package gl.itp.hyd65.cs65.Royce;

import java.util.Random;

public class Advisor {

	String[] message;
	
	public Advisor()
	{
		message = new String[5];
		message[0] = "Do your best!";
		message[1] = "Never give up!";
		message[2] = "Always strive to improve!";
		message[3] = "Aspire to reach the top!";
		message[4] = "Count your blessings and keep moving!";
	}
	
	public String getAdvice()
	{
		Random rand = new Random();
		int option = rand.nextInt(5) + 1;
		String advice = "";
		switch (option)
		{
			case 1:
				advice = message[0];
				break;
			case 2:
				advice = message[1];
				break;
			case 3:
				advice = message[2];
				break;
			case 4:
				advice = message[3];
				break;
			case 5:
				advice = message[4];
				break;
		}
		
		return advice;
	}
	
	
}
