/** basic calculation
 * third day of Java
 * 2013
*/

import java.util.Random;

public class JavaBasic03Arithmetic 
{
	public static void main(String[] args)
	{
		Random rand = new Random(); //create random object
		double number1, number2, number3,number4;
		int value =5;
		double v = 5.0;
		number1 = rand.nextInt(100) + 1; //1-100;
		number2 = rand.nextInt(100) + 1;
		number3 = rand.nextInt(100) + 1;
		number4 = rand.nextInt(100) + 1;
		System.out.println("number 1 is "+ number1);
		System.out.println("number 2 is "+ number2);
		System.out.println("number 3 is "+ number3);
		System.out.println("number 4 is "+ number4);
		
		System.out.println("Addition: number 1 + number 2 is " + (number1 + number2));
		System.out.println("Subtraction: number 2 - number 3 is " + (number1 - number2));
		System.out.println("multiplication: number 3 * number 4 is " + (number3 * number4));
		System.out.println("Division: number 4 / number 1 is " + (number4 / number1));
		System.out.println("Reminder: number1 % number2 is " + (number1 % number2));
		
		System.out.println("integer value "+value + "/2 = " + value/2);
		System.out.println("Double value "+v + "/2 = " + v/2);
		System.out.println("2 times 4 is "+Math.pow(4.0,2.0));
		System.out.println("Sqrt 16 is "+Math.sqrt(16.0));
		// - Hightest precedence
		// */% mid
		// + - lowest
		// use () for ensure + or - perform before * or/
	}
}
