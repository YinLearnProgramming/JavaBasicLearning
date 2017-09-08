package JavaBasic37Abstract;

public class CompStudentDriver {
	 public static void main(String[] args)
	   {
	      CompStudent csStudent = new CompStudent("Jennifer Haynes","167W98337", 2017);

	      csStudent.setMathHours(12);
	      csStudent.setCsHours(20);
	      csStudent.setGenEdHours(40);

	      System.out.println(csStudent);

	      System.out.println("Hours remaining: " + csStudent.getRemainingHours());       
	   }
}
