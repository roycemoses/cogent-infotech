package review;


public class find_unique {

	public static void main(String[] args) {
		int[] arr = {4, 4, 4, 14, 14, 4, 20, 5, 0, 4, 0, 19, 20};
		Boolean isUnique = true;
		
		for (int i = 0; i < arr.length; i++)
		{
			isUnique = true;
			for (int j = 0; j < i; j++)
			{
				if (arr[i] == arr[j])
					isUnique = false; 
			}
			if (isUnique)
			{
				System.out.print(arr[i]); 
				System.out.print(' ');
			}
		}
	}

}
