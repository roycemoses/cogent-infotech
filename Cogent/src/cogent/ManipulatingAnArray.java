package cogent;

import java.lang.Math;

public class ManipulatingAnArray {
	
	public static void main(String[] args) {
		
		int arr[] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
		int sum = 0;
		int min = arr[0];
		for(int i = 0; i < 15; i++)
		{
			sum += arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		arr[15] = sum;
		arr[16] = (int)Math.round(sum / 15.0);
		arr[17] = min;
		
		for (int i:arr)
		{
			System.out.print(i);
			System.out.print(' ');
		}
	
	}

}
