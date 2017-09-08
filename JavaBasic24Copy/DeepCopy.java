package JavaBasic24Copy;

public class DeepCopy 
{
	public static void main(String[] args)
	{
		Courses science = new Courses("Physics", "Chemistry", "Biology");
	    Students student1 = new Students(111, "John", science);
	    Students student2 = null;
	    
	    try
        {
            //Creating a clone of student1 and assigning it to student2
            student2 = (Students) student1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
 
	    //Printing 'student1'
	    System.out.println(student1.course.subject1);
	    System.out.println(student1.course.subject2);
	    System.out.println(student1.course.subject3);
	    System.out.println("----------------Student1-------------------------");
	    //Printing 'student2'
	    System.out.println(student2.course.subject1);
	    System.out.println(student2.course.subject2);
	    System.out.println(student2.course.subject3);
	    System.out.println("----------------Student2-------------------------");
	    System.out.println("Changing the subject3 of 'student2'");
	    student2.course.subject3 = "Maths";
    	System.out.println("print the subject3 of 'student1'");
    	//This change will be reflected in original student 'student1'
    	System.out.println(student1.course.subject3);
	}
}
class Courses implements Cloneable
{
	String subject1;
    String subject2;
    String subject3;

    public Courses(String sub1, String sub2, String sub3)
    {
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
    }
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class Students implements Cloneable
{
    int id;
    String name;
    Courses course;
 
    public Students(int id, String name, Courses course)
    {
        this.id = id;
        this.name = name;
        this.course = course;
    }
 
    //Overriding clone() method to create a deep copy of an object.
 
    protected Object clone() throws CloneNotSupportedException
    {
        Students student = (Students) super.clone();
        student.course = (Courses) course.clone();
        return student;
    }
}