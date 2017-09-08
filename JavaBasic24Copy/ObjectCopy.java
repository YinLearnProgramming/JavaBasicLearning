package JavaBasic24Copy;

public class ObjectCopy 
{
	public static void main(String[] args)
	{
		Stock company1 = new Stock("XYZ",9.99);
		Stock company2;
		
		//Shallow copy
		company2 = company1;
		
		System.out.println("Company 1: \n" + company1.toString());
		System.out.println("Company 2: \n" + company2.toString());
	}
}
// or write a method to copy
//public Stock(Stock obj)
//{
//	name = obj.getName();
//  number = obj.getNumber();
//}