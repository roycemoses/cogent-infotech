package exceptions_calc;

public class BankAccount {

	private int accNo;
	private String custName;
	private String accType;
	private float balance;
	
	public BankAccount(int accNo, String custName, String accType, float balance)
	{
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}
	
	public void deposit(float amt) throws NegativeAmountException
	{
		if (amt < 0)
			throw new NegativeAmountException(amt + " is not a valid amount.");
		else
			this.balance += amt;
	}
	
	public void withdraw(float amt) throws NegativeAmountException, InsufficientFundsException
	{
		if (amt < 0)
		{
			throw new NegativeAmountException("Cannot perform negative withdrawal. Current balance: " + this.balance);
//			return;
		}
		
		if (this.accType == "Savings" && balance < 1000)
			throw new InsufficientFundsException("Insufficient funds. Current balance: " + this.balance + "\nMinimum balance needed to withdraw from Savings: 1000.0");
		else if (this.accType == "Current" && balance < 5000)
			throw new InsufficientFundsException("Insufficient funds. Current balance: " + this.balance + "\nMinimum balance needed to withdraw from Current: 5000.0");
		else
			this.balance -= amt;
	}
	
	public float getBalance() throws NegativeAmountException, LowBalanceException
	{
		if (this.balance < 0)
		{
			throw new NegativeAmountException("Negative balance amount. Current balance: " + this.balance);
//			return -1.0f;
		}
		
		if (this.accType == "Savings" && balance < 1000)
			throw new LowBalanceException("Low balance. Current balance: " + this.balance + "\nMinimum balance needed to withdraw from Savings: 1000");
		else if (this.accType == "Current" && balance < 5000)
			throw new LowBalanceException("Low balance. Current balance: " + this.balance + "\nMinimum balance needed to withdraw from Current: 5000");
		
		return this.balance; 
	}
	
}
