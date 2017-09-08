package JavaBasic23Static;

public class BankAccount 
{
	private double balance;
	static private double rate = 0.2;
	static private int count;
	
	public BankAccount(double b)
	{
		balance = b;
		count++;
	}
	static public void setRate(double r)
	{
        rate = r;
    }
	static public double getRate()
	{
        return rate;
    }
	public void deposit(double amount)
	{
        balance += amount;
    }
	
	public double computeInterest()
	{
        double interest = balance * rate;
        deposit(interest);
        return interest;
    }
	
	public int getCount()
	{
		return count;
	}
}
