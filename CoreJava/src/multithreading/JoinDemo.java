package multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread {

	static Integer n, sum = 0;
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		System.out.println("Enter a natural number (n): ");
		Scanner sc = new Scanner(System.in);
		
		JoinDemo.n = Integer.parseInt(sc.nextLine());
		
		JoinDemo jd = new JoinDemo();
		jd.start();
		try {
			jd.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("The sum of the first " + JoinDemo.n + " (n) numbers is " + JoinDemo.sum);
		long end = System.currentTimeMillis();
		System.out.println("Total time elapsed: " + (end-start)/1000.0 + " seconds.");
		
		sc.close();
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= JoinDemo.n; i++)
		{	
			JoinDemo.sum += i;
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
	
}
