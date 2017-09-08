//++,-- incrementing and decrementing,postfix and prefix
import javax.swing.*;
public class JavaBasic13Loop 
{
	public static void main(String[] args)
	{
		String control;
		String selection;
		String score;
		double point;
		
		do
		{
			selection = JOptionPane.showInputDialog("Enter A for using grading system. B for information.");
			switch(selection)
			{
			case "A":
			case "a":
				JOptionPane.showMessageDialog(null, "Welcome to grading system!");
				score = JOptionPane.showInputDialog("What is your score?");
				point = Double.parseDouble(score);
				
				if(point>=90)//>,<,>=,<= also, ||,&&,!
				{
					JOptionPane.showMessageDialog(null, "You get A !");
				}
				else if(point>=80)
				{
					JOptionPane.showMessageDialog(null, "You get B !");
				}
				else if(point>=70)
				{
					JOptionPane.showMessageDialog(null, "You get C !");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You get D !");
				}
			break;
				
			case "B":
			case "b":
				JOptionPane.showMessageDialog(null, "This is a program for user entering score and get the grading.");
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "please contact with your administrator! 707-345-9987 Thank you!");
			break;
			}
			control = JOptionPane.showInputDialog("Enter Yes or yes to try again.");
		}
		while(control.equals("Yes")||control.equals("yes"));
		System.exit(0);
	}
}
/**
*while,do while,for
*
*while(condition) //it is pretest
*{
*	true condition
*	change condition
*}
*
*do //posttest
*{
*	true statement
*}
*while(condition)
*
* for(init;test;update)//pretest
* {}
**/