package JavaBasic38Interface;
import java.text.DecimalFormat;
public class InterfaceDemo 
{

	public static void main(String[] args) 
	{
	
		CompactDisc cd = new CompactDisc("pokemon","Nintendo",18.95);
		DvdMovie movie = new DvdMovie("call of duty", 137, 12.95);
		System.out.println("Item #1: " +cd.getTitle());
		showPrice(cd);
	    System.out.println("Item #2: " +movie.getTitle());
	    showPrice(movie);
	   }
	   
	   private static void showPrice(RetailItem item)
	   {
	      DecimalFormat dollar =new DecimalFormat("#,##.00");
	    
	      System.out.println("Price: $" +dollar.format(item.getRetailPrice()));
	 }
}

