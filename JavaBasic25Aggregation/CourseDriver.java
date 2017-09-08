package JavaBasic25Aggregation;
/* Security Issues with Aggregate Classes
 * Perform Deep Copies When Creating Field Objects
 * Return Copies of Field Objects, Not the Originals
 */
public class CourseDriver 
{
	public static void main(String[] args)
	{
		Instructor myintructor = new Instructor("lee","simon","WW123");
		TextBook myTextBook = new TextBook("Java","simon","YinProgamming");
		Course myCourse = new Course("intro to java",myintructor,myTextBook);
		System.out.println(myCourse);
	}
}
