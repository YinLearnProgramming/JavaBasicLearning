package JavaBasic18Abstraction;

public class RectangleDriver 
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(5,6);
		System.out.println(r.toString());
		
		Rectangle r2 = new Rectangle();
		r2.setLength(9);
		r2.setWidth(10);
	
		System.out.println(r2.toString());
		
		System.out.println("There is UML");
		System.out.println("--------------------------------------");
		System.out.println("|        Rectangle                   |");
		System.out.println("--------------------------------------");
		System.out.println("|- length:double                     |");
		System.out.println("|- width:double                      |");
		System.out.println("--------------------------------------");
		System.out.println("|+ Rectangle                         |");
		System.out.println("|+ Rectangle (len,wid:double)        |");
		System.out.println("|+ setLength (len:double):void       |");
		System.out.println("|+ setWidth (wid:double):void        |");
		System.out.println("|+ getLength() :double               |");
		System.out.println("|+ getWidth() :double                |");
		System.out.println("|+ getArea() :double                 |");
		System.out.println("|+ toString() :String                |");
		System.out.println("--------------------------------------");
	}
}
