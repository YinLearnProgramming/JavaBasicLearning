import java.util.*;
public class JavaBasic22ArrayList 
{
	public static void main(String[] args)
	{
		ArrayList<String> nameList = new ArrayList<String>();
		
		// Add some names to the ArrayList.
		nameList.add("James");
		nameList.add("Catherine");
		nameList.add("Bill");
		
		System.out.println("The ArrayList has "+ nameList.size() + " objects.");
		
		for(int index = 0;index < nameList.size(); index++)
		{
			System.out.println(nameList.get(index));
		}
		nameList.remove(1);
		System.out.println("Del object 1");
		for(String n: nameList)
		{
			System.out.println(n);
		}
		nameList.add(0, "Mary");//add object to the location
		System.out.println("Add object");
		for(String n: nameList)
		{
			System.out.println(n);
		}
	}
}
