import java.io.*; // For File class and BufferedReader
import javax.swing.JOptionPane; // For the JOptionPane class
/**
 * This is the Morse driver program. it requires user to input string sentence and output with JOptionPane 
 * 
 * @author (Yin Hang Kwok) 
 * @version (2/15/2016)
 */
public class Morse
{
    public static void main(String[] args) throws IOException
    {
        Code c = new Code(); // call Code class
        String FirstReceivedString;
        String userInput = JOptionPane.showInputDialog("Please enter an English language phrase!");
        while(!userInput.contains("(0)")) //if user input (0) , then end this program
        {
            FirstReceivedString = userInput.toString().toUpperCase();// make sure every character are upper case
            JOptionPane.showMessageDialog(null, c.encode(FirstReceivedString));
            userInput = JOptionPane.showInputDialog("Please enter an English language phrase!");
        }
        JOptionPane.showMessageDialog(null,"Progarm finish!");
    }
}
