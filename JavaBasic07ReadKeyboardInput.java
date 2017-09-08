import java.util.Scanner;

public class JavaBasic07ReadKeyboardInput 
{
	public static void main(String[] args)
	{
		double number;
		String myString;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number!");
		number = keyboard.nextDouble();//nextByte, nextFloat. nextInt, nextShort, nextLong, nextLine
		
		System.out.println("The number is " + number);
		
		// scope problem 
		// use scanner read primitive object then use scanner read string object
		//solution : read empty input before read string object
		
		keyboard.nextLine(); //consume the remaining newline
		
		System.out.println("Enter a word!");
		myString = keyboard.nextLine();
		
		System.out.println("The word is " + myString);
	}
}
