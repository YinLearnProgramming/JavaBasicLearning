import javax.swing.JOptionPane;
public class JavaBasic08DiaogBoxes
{
	public static void main(String[] args)
	{
		String name;
		
		name = JOptionPane.showInputDialog("What is your name?");//must return string
		
		JOptionPane.showMessageDialog(null, "Hello " + name);
		System.exit(0);
		
	}
}
