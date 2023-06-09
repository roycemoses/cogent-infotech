package exceptions_calc;

public class CalcAverage {

	public double avgFirstN(int N) throws IllegalArgumentException
	{
		if (N < 0)
			throw new IllegalArgumentException(N + " is not a legal argument!");
		
		double sum = 0.0;
		for (int i = 1; i <= N; i++)
			sum += i;
		
		return sum / N;
	}
	
}
