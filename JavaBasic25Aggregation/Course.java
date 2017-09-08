package JavaBasic25Aggregation;

public class Course 
{
	private String courseName;
	private Instructor instructor;
	private TextBook textBook;
	
	public Course(String n, Instructor i, TextBook t)
	{
		this.courseName = n;
		this.instructor = new Instructor(i);
		this.textBook = new TextBook(t);
	}
	
	public String getName()
	{
		return courseName;
	}
	
	public Instructor getInstructor()
	{
		return new Instructor(instructor);
	}
	
	public TextBook getTextBook()
	{
		return new TextBook(textBook);
	}
	
	public String toString()
	{
		String str = "Course name: " + courseName +
				"\nInstructor: " + instructor +
				"\nTextBook: " + textBook;
		return str;
	}
}
