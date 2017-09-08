package JavaBasic25Aggregation;

public class Instructor 
{
	private String lastName;
	private String firstName;
	private String officeNumber;
	
	public Instructor()
	{
		this.lastName = null;
		this.firstName = null;
		this.officeNumber = null;
	}
	
	public Instructor(String l, String f, String o)
	{
		this.lastName = l;
		this.firstName = f;
		this.officeNumber = o;
	}
	
	public Instructor(Instructor obj)
	{
		this.lastName = obj.lastName;
		this.firstName = obj.firstName;
		this.officeNumber = obj.officeNumber;
	}
	
	public void set(String l, String f, String o)
	{
		lastName = l;
		firstName = f;
		officeNumber = o;
	}
	
	public String toString()
	{
		String str = "Last Name: " + lastName + 
				"\nFirst Name: " + firstName +
				"\nOffice Number: " + officeNumber;
		return str;
	}
}
