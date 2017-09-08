/**
 * Overloading method
 * @author YHK
 *
 */
public class JavaBasic17MethodOverloading 
{
	public static void main(String[] args)
	{
		
	}
	
	public int add(int n1,int n2)// same method name but difference in parameter
	{
		int sum = n1 + n2;
		return sum;
	}
	public String add(String s1, String s2)
	{
		String sum = s1 + s2;
		return sum;
	}
}
