import java.util.StringTokenizer;

public class JavaBasic31StringTokenizer 
{
	public static void main(String[] args)
	{
		StringTokenizer str = new StringTokenizer("my name is Yin", " "); 
		
		//System.out.println(str.nextToken()); 
		
		while (str.hasMoreTokens()) 
		{  
	         System.out.println(str.nextToken()); 
		}
	}
}
