package JavaBasic24Copy;

public class Stock 
{
	private String name;
	private double number;
	
	public Stock()
	{
		name = null;
		number = 0;
	}
	
	public Stock(String n, double num)
	{
		name = n;
		number = num;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setNumber(double num)
	{
		number = num;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getNumber()
	{
		return number;
	}
	
	public String toString()
	{
		return ("name: "+ name +"\nnumber: " + number);
	}
}
