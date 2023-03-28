package exceptions_calc;

import java.util.Scanner;

public class BankAccountDemo {

	public static void main(String[] args) throws Exception {
		
		BankAccount baRoyce = new BankAccount(1, "Royce", "Savings", 2000);
		BankAccount baChris = new BankAccount(2, "Chris", "Savings", 500);
		BankAccount baCharles = new BankAccount(3, "Charles", "Current", -7500);
		BankAccount baChelsea = new BankAccount(4, "Chelsea", "Current", 4500);
			
		// NEGATIVE AMOUNT EXCEPTION
		try
		{
			baRoyce.deposit(-100);
		}
		catch (NegativeAmountException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		// INSUFFICIENT FUNDS EXCEPTION
		try
		{
			baChris.withdraw(250);
		}
		catch (InsufficientFundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		// NEGATIVE AMOUNT EXCEPTION
		try
		{
			baCharles.withdraw(-250);
		}
		catch (NegativeAmountException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		// NEGATIVE AMOUNT EXCEPTION
		try
		{
			baCharles.getBalance();
		}
		catch (NegativeAmountException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		// LOW BALANCE EXCEPTION
		try
		{
			baChelsea.getBalance();
		}
		catch (LowBalanceException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
}
