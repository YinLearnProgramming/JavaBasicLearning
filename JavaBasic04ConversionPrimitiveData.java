/**
 * conversion
 * @YHK
 */
public class JavaBasic04ConversionPrimitiveData 
{
	public static void main(String[] args)
	{
		int num = 10;
		double numbers;
		final int NUMBER_TO_CONVERSION = 99; //final for constants
		double finalNumber;
		
		numbers = (double) num;// cast operation
		finalNumber = Double.valueOf(NUMBER_TO_CONVERSION);
		System.out.println("The number in integer is " + num);
		System.out.println("The number is in double is " + numbers);
		System.out.println("The final number is " + finalNumber);
	}
}
