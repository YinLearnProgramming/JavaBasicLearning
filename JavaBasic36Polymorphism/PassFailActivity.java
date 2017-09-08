package JavaBasic36Polymorphism;

public class PassFailActivity extends GradedActivity 
{
	private double minPassingScore;

	   public PassFailActivity(double mps)
	   {
	      minPassingScore = mps;
	   }

	   public char getGrade()
	   {
	      char letterGrade;

	      if (super.getScore() >= minPassingScore)
	         letterGrade = 'P';
	      else
	         letterGrade = 'F';

	      return letterGrade;
	   }
}
