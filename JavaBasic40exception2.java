
public class JavaBasic40exception2 {

	public static void main(String[] args) {
		String str = "abcde";
	       int number;

	       try
	       {
	          number = Integer.parseInt(str);
	       }
	       catch (NumberFormatException e)//InputMismatchException
	       { 
	          System.out.println("Conversion error: " +
	                             e.getMessage());
	       }
	       catch (IllegalArgumentException e)
	       {
	    	   System.out.println("bad number format");
	       }

	}

}
