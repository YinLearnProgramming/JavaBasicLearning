import java.util.Scanner;
import java.io.*;   

public class JavaBasic15FileReader 
{
	public static void main(String[] args) throws IOException
	{
		String filename;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the filename: ");
		
	    filename = keyboard.nextLine();
	    
	    File file = new File(filename);
	    if (!file.exists())
	    {
	     	System.out.println("The file is not found.");
	        System.exit(0);
	    }
	    
	    Scanner inputFile = new Scanner(file);
	    while (inputFile.hasNext())
	    {
	        String line = inputFile.nextLine();
	        System.out.println(line);
	        
	        String[] words = line.split(" ");
	        for(int i =0;i<words.length;i++)
	        {
	        	System.out.println(words[i]);
	        }
	    }
	    
	    inputFile.close();
	}
}
