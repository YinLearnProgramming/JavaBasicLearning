
public class JavaBasic16Method 
{
	public static void main(String[] args)
	{
		double num1 = 5;//pass by reference
		double num2 = 6;
		
		displayMessage(); //method calling
		displayValue(5);//pass by value
		System.out.println("The value is : " + displaysum(5,6));
	}
	
	public static void displayMessage() //void no return
	{
		System.out.println("message here!");
	}
	
	public static void displayValue(int x)
	{
		System.out.println("The value is :" +x);
	}
	/**
	 * 
	 * @param a - number 1
	 * @param b - number 2
	 * @return sum - sum of number 1 and 2
	 */
	public static double displaysum(double a, double b)
	{
		double sum;
		sum = a + b;
		return sum;
	}
}
//if you pass the string object into method and change it in method.
// no return the edited string, then string remain unchanged. because string object is immutable 