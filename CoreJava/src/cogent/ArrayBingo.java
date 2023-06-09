package cogent;

import java.util.Random;

public class ArrayBingo {
	public static void main(String[] args) {
	
		if (args.length != 2)
		{
			System.out.println("Please enter two integers!");
		}
		else
		{
			// String -> int
			int firstNum = Integer.parseInt(args[0]);
			int secondNum = Integer.parseInt(args[1]);
			if (firstNum < 1 || firstNum > 40 || secondNum < 1 || secondNum > 40)
			{
				System.out.println("Please input valid integer ranges! (1-40)");
				return;
			}
			
			System.out.println("First number: " + firstNum);
			System.out.println("Second number: " + secondNum);
			
			int bingoArray[] = {5, 10, 15, 30, 40};
			randomizeArray(bingoArray);			
			
			int correct = 0;
			for(int i:bingoArray)
			{
				if (firstNum == i || secondNum == i)
					correct++;
			}
			
			// Output all bingo numbers
			System.out.print("Bingo numbers: ");
			for(int i:bingoArray)
			{
				System.out.print(i);
				System.out.print(' ');
			}
			System.out.println();
			
			
			if (correct == 2)
				System.out.println("Congratulations, it's BINGO!");
			else
				System.out.println("Better luck next time!");
						
		}
			
	}
	
	static void randomizeArray(int bingoArray[])
	{
		Random rand = new Random();
		for(int i = 0; i < 5; i++)
			bingoArray[i] = 1 + rand.nextInt(39);
	}
	
}
