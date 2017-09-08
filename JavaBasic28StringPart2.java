
public class JavaBasic28StringPart2 
{
	public static void main(String[] args)
	{
		String str = "he5lloT ";
		char check;
		
		check = str.charAt(2);
		if(Character.isDigit(check))
		{
			System.out.println("location of 2 of " + str + "is a digit");
		}
		
		check = str.charAt(0);
		if(Character.isLetter(check))
		{
			System.out.println("location of 0 of " + str + "is a letter");
		}
		
		check = str.charAt(1);
		if(Character.isLetterOrDigit(check))
		{
			System.out.println("location of 1 of " + str + "is a letter or a digit");
		}
		//isLowerCase
		//isUpperCase
		//isSpaceChar
		//isWhiteSpace
	}
}
