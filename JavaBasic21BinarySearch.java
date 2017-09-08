
public class JavaBasic21BinarySearch {
	public static void main(String[] args)
	{
		int first;
		int last;
		int middle;
		int location;
		boolean find;
		int [] numbers = {8,3,4,7,5,9,1,2,0};
		int value = 9;
		
		first = 0;
		last = numbers.length-1;
		location = -1;
		find = false;
		
		while(!find && first <= last)
		{
			middle = (first+ last)/2;
			if(numbers[middle] == value)
			{
				find = true;
				location = middle;
			}
			else if(numbers[middle] >value)
			{
				last = middle -1;
			}
			else
			{
				first = middle +1;
			}
		}
		System.out.println("The position is  " + location);
	}
}
