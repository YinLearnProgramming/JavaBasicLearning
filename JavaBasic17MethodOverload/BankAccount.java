package JavaBasic17MethodOverload;

public class BankAccount 
{
	private double balance;
	
	public BankAccount()
	{
		balance = 0;
	}
	
	public BankAccount(double StartBalance)
	{
		balance = StartBalance;
	}
	
	public BankAccount(String str)
	{
		balance = Double.parseDouble(str);
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void deposit(String s)
	{
		balance += Double.parseDouble(s);
	}
	
	public void withdraw(double am)
	{
		balance -= am;
	}
	
	public void withdraw(String st)
	{
		balance -= Double.parseDouble(st);
	}
	
	public void setBalance(double b)
	{
		balance = b;
	}
	
	public void setBalance(String b)
	{
		balance = Double.parseDouble(b);
	}
	
	public double getBalance()
	{
		return balance;
	}
}
