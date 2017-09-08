
public class JavaBasic29StringPart3 
{
	public static void main(String[] args )
	{
		String str = "Four score and seven years ago";
		String str2 = "score";
		
		if (str.startsWith("Four"))
		{
			System.out.println("True");
		}
		
		if (str.endsWith("ago"))
		{
			System.out.println("True");
		}
		
		System.out.println(str.regionMatches(5, str2, 0, 4));
		
		String Str = new String("Welcome to yin programming");
	    System.out.print("Found Last Index :" );
	    System.out.println(Str.lastIndexOf( 'o' ));
		//indexOf
		//lastIndexOf
	    //getChars
	    //char[] toCharArray()
	    //concat
	    //replace
	    //trim
	}
}
