import java.io.*; // For File class and BufferedReader
import java.util.*; // For Scanner and ArrayList class
import javax.swing.JOptionPane; // For the JOptionPane class
/**
 * this is the Code class. it get the string English sentence from driver class(Morse) and convert to morse code.
 * 
 * @author (Yin Hang Kwok) 
 * @version (2/15/2016)
 */
public class Code
{
    private ArrayList<String> alphaList; // arraylist to hold alpha
    private ArrayList<String> codeList; // arraylist to hold Morse code
    
    public Code()
    {
        alphaList = new ArrayList<String>();
        codeList = new ArrayList<String>();
        readFile(); //read file
    }
    
    /*
     * this method is reading file(morse.txt)
     */
    public void readFile()
    {
        String fileName = "Morse.txt"; // File name
        try
        {
            Scanner inputFile = new Scanner(new File(fileName));//read file
            JOptionPane.showMessageDialog(null,"Finding Morse Code.txt!");
            while(inputFile.hasNext()) //read file line by line
            {
                String alaph = inputFile.next().toUpperCase(); //make sure it is upper case
                String code = inputFile.next();
                alphaList.add(alaph); //put it into arraylist
                codeList.add(code); //put it into arraylist
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Cannot Find Morse Code.txt!");
        }
    }
    /*
     * this method get the user input and call other method to convert.
     * @param input - user input(String English sentence) 
     * @return - completed sentence and present by Morse code
     */
    public String encode(String input)
	{
		input=input.toUpperCase(); //make sure every character in sentence is upper case
		Scanner line = new Scanner(input);
		String encodedMorseCodeInSentence ="";
		while(line.hasNext())
		{
			encodedMorseCodeInSentence += morseWord(line.next());
		}
		return encodedMorseCodeInSentence;
	}
	/*
     * this method get the English sentence and pull the word to other method in order to convert.
     * @param word - word from English sentence
     * @return - completed word and present by Morse code
     */
	public String morseWord(String word)
	{
		String encodedMorseCodeWord="";
		for(int index=0;index<word.length();index++)
		{
			encodedMorseCodeWord += MorseCharacter(word.charAt(index))+" ";
		}
		return (encodedMorseCodeWord+"   ");
	}
	/*
     * this method get the English word 
     * it takes characters and find the correct morse code.
     * @param character - character from English sentence
     * @return - character and present by Morse code
     */
	public String MorseCharacter(char character)
	{
		for(int i=0;i<alphaList.size();i++)
		{
			if(alphaList.get(i).equals(character+""))
			{
			    return codeList.get(i);
			}
			else
			{
			    
			}
		}
		return (character+" ");
	}
}
