package JavaBasic18Abstraction;
// in Abstraction, we only create a class of the general object.
// if there are 2 types of Rectangle, we only create a class called Rectangle.
// for the specific rectangle, we will use Inheritance
public class Rectangle 
{
	private double length; //access control
	private double width;
	//constructor automatically called when object created
	public Rectangle()
	{
		length = 1;
		width = 1;
	}
	
	public Rectangle(double len, double wid)
	{
		length = len;
		width = wid;
		
	}
	//accessor and mutator
	//getter and setter
	public void setLength(double len)
	{
		length = len;
	}
	
	public void setWidth(double wid)
	{
		width = wid;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getArea() //if method add final, that this method cannot override
	{
		return (length*width);
	}
	
	public String toString()
	{
		return ("The length is " + length + "\n" + "The width is " + width + "\n" + "The area is " + getArea() +"\n");
	}
}