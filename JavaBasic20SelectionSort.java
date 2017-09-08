
public class JavaBasic20SelectionSort {
	public static void main(String[] args)
	{
		int [] numbers = {8,3,4,7,5,9,1,2,0};
		int minIndex = 0;
		int minValue = 0;
		
		System.out.print("The array is ");
		
		for(int value : numbers)
		{
			System.out.print(value + " ");
		}
		System.out.println("\n------------------------------------------");
		
		for(int start = 0;start<numbers.length-1;start++)
		{
			minIndex = start;
			minValue = numbers[start];
			
			for(int index = 1; index<numbers.length;index++)
			{
				if(numbers[index]<minValue)
				{
					minValue = numbers[index];
					minIndex = index;
				}
			}
			numbers[minIndex] = numbers[start];
			numbers[start] = minValue;
		}	
		
		System.out.print("The array is ");
		
		for(int value : numbers)
		{
			System.out.print(value + " ");
		}
		System.out.println("\n------------------------------------------");
	}
}
