
public class JavaBasic30StringBuilder 
{
	public static void main(String[] args)
	{
		StringBuilder city = new StringBuilder("Charleston");
		System.out.println(city);
		city.append(" a city.");
		System.out.println(city);
		city.insert(10, " is");
		System.out.println(city);
		city.delete(16, 21);
		System.out.println(city);
	}
	//append = concat
	//deleteCharAt
}
