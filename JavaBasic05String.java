/**
 * String class
 *
 */
public class JavaBasic05String 
{
	public static void main(String[] args)
	{
		String sentence = "this is an example!"; //create string object
		System.out.println(sentence);
		
		String subsentence = "exam";
		System.out.println(subsentence);
		
		String upper = sentence.toUpperCase(); //upper case
		System.out.println(upper);
		
		String lower = sentence.toLowerCase(); //lower case
		System.out.println(lower);
		
		char letter = sentence.charAt(2); //get the letter based on position
		System.out.println(letter);
		
		int stringSize = sentence.length(); //get the length of string object
		System.out.println(stringSize);
		// end of chapter 2
		
		String number = "004-034556";
		String[] parts = number.split("-"); //split String by -
	    String part1 = parts[0]; // 004
	    String part2 = parts[1]; // 034556
	    System.out.println(part1);
		System.out.println(part2);
	    
		int findLocation;
		int findLastLocation;

		String combineSentence = "This";
		combineSentence = combineSentence.concat(" is").concat(" just a").concat(" String");
		combineSentence.trim();
	    System.out.println(combineSentence);
	    findLocation = combineSentence.indexOf("a");
	    findLastLocation = combineSentence.lastIndexOf("i");
	    System.out.println(findLocation);
	    System.out.println(findLastLocation);
	    
	    boolean check = combineSentence.endsWith("String");
	    System.out.println(check);
	    
	    //string compare
	    String name1 = "Mark", name2 = "Mark";
	    if (name1 == name2)  // ERROR!
	    {
	    	System.out.println(name1 + " and " + name2 + " are the same.");
	    }
	    else
	    {
	        System.out.println(name1 + " and " + name2 + " are the NOT the same.");
	    }
	    //equalsIgnoreCase
	    //equals e.g.name1.equals(name2)
	    //compareTo e.g.name1.compareTo(name2) < 0
	    
	    //covert string to number
	    double firstNumber;
	    double secondNumber;
	    String myString ="";
	    firstNumber = Double.parseDouble(part1);
	    secondNumber = Double.parseDouble(part2);
	    System.out.println(firstNumber);
	    System.out.println(secondNumber);
	    myString = Double.toString(secondNumber); //String.valueOf(secondNumber); 
	    System.out.println(myString); //deep copy Integer obj = new Integer(d); String str = secondNumber.toString();
	}
}
