import java.util.*;
public class JavaBasic19Arrays 
{
	public static void main(String[] args)
	{
		int [] numbers = new int[20];
		final int LIMIT = 10;
		double[] numberList = new double[LIMIT]; //index from 0 to 9
		int[] days = {1,2,3,4,5,6,7};
		int sum = 0;
		int highest = 0;
		String [] months = {"January", "Fedruary","March",
				            "April","May","June","July",
				            "August","September","October",
				            "November","December"};
		int count = 0;
		String month = "";
		double[][] twoDArray = new double[3][4];
		
		Scanner input = new Scanner(System.in);
		
		for(int index = 0;index< days.length;index++)//arrays.length<--size of array
		{
			System.out.println(days[index] + " ");
		}
		
		System.out.println("----------------------------");
		
		for(int value : days)//other types of for loop
		{
			System.out.println(value + " ");
		}
		
		System.out.println("----------------------------");
		
		showValue(days);
		
		System.out.println("----------------------------");
		
		for(int i = 0; i<days.length;i++)
		{
			sum += days[i];
		}
		System.out.println("The average is " + sum/days.length);
		
		System.out.println("----------------------------");
		
		for(int h = 0; h<days.length;h++)
		{
			if(days[h] > highest)
			{
				highest = days[h];
			}
		}
		System.out.println("The highest point is " + highest);
		
		System.out.println("----------------------------");
		System.out.println("What is the month you are looking for?");
		month = input.nextLine();
		
		for(int s = 0;s<months.length;s++)
		{
			
			if(month.equals(months[s]))
			{
				count = s + 1;
			}
		}
		System.out.println("the location is " + count);
		
		for(int row = 0; row<3;row++)
		{
			for(int col = 0;col< 4;col++)
			{
				System.out.println("inside 2D arrays");
			}
		}
	}
	
	public static void showValue(int[] a)
	{
		for(int value : a)
		{
			System.out.println(value + " ");
		}
	}
}
