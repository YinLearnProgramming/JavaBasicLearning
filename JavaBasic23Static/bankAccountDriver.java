package JavaBasic23Static;

public class bankAccountDriver 
{
	public static void main(String[] args)
	{
		BankAccount bA = new BankAccount(3000);
		
		System.out.println(bA.computeInterest());
		System.out.println(bA.getCount());
		
		BankAccount bA2 = new BankAccount(5000);
		
		System.out.println(bA2.computeInterest());
		System.out.println(bA2.getCount());
		
		System.out.println(bA.getCount());
	}
}
