package cogent;
import java.util.Scanner;


public class ArrayLesson {
	public static void main(String[] args) {
//		// invalid syntax
////		int arr[5];
//		
//		int arr[] = {10, 20, 30, 40 , 50};
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			System.out.println(arr[i]);
//		}
//		
//		int array[] = new int[5];
//		array[0] = 100;
//		array[1] = 200;
//		array[2] = 300;
//		
//		System.out.println("Elements of the array:");
//		
//		for(int i = 0; i < array.length; i++)
//		{
//			System.out.println(array[i]);
//		}
//		
//		// out of bounds
////		System.out.println(array[10]);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of an array");
		int sz = sc.nextInt();
		int scores[] = new int[sz];
		
		for(int i = 0; i < scores.length; i++)
		{
			System.out.println("Please enter the score");
			int score = sc.nextInt();
			scores[i] = score;
		}
		
//		int sum = 0;
//		for(int i = 0; i < scores.length; i++)
//			sum += scores[i];
//		System.out.println(sum);
		
		// for each loop
		for(int s:scores)
		{
			System.out.println(s);
		}
		
	}
}
