import java.io.*;
import java.util.Scanner;

public class JavaBasic14FileWriter 
{
	public static void main(String[] args) throws IOException
	{
		String filename;
		Scanner keyboard = new Scanner(System.in);
		//ask for file name
		System.out.print("Enter the filename: ");
	    filename = keyboard.nextLine();//"person.txt"
	    
	    File file = new File(filename);
	    //check file exit
	    if (file.exists())
	    {
	       System.out.println("The file " + filename + " already exists.");
	       System.exit(0);
	    }
	    
	    PrintWriter outputFile = new PrintWriter(filename);
	    
	    outputFile.println("Jeffeay Smith 555-333-7777");
	    outputFile.println("John Coner 222-888-6666");
	    outputFile.close();
	    System.out.println("Data written to the file.");
	}
}
