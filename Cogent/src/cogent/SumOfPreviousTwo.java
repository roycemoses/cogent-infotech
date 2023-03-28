package cogent;

public class SumOfPreviousTwo {
	public static void main(String[] args) {
		if (args.length != 2)
		{
			System.out.println("Please enter two integer arguments!");
		}
		else
		{
			System.out.print(args[0] + ' ' + args[1] + ' ');
			int prev1 = Integer.parseInt(args[0]);
			int prev2 = Integer.parseInt(args[1]);
			int temp = prev2;
			for (int i = 0; i < 13; i++)
			{
				System.out.print(prev1 + prev2);
				System.out.print(' ');
				temp = prev1;
				prev1 = prev2;
				prev2 = temp + prev2;
			}
		}
	}
}
