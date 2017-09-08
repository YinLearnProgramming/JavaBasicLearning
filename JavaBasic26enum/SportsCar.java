package JavaBasic26enum;
import java.text.DecimalFormat;
public class SportsCar 
{
	private CarType make;
	private CarColor color;
	private double price;
	
	public SportsCar(CarType amake, CarColor aColor,double aPrice)
	{
		make = amake;
		color = aColor;
		price = aPrice;
	}
	
	public CarType getMake()
	{
		return make;
	}
	
	public CarColor getColor()
	{
		return color;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		
		String str = "Make: " + make + 
				"\nColor: " + color +
				"\nPrice:" + price;
		return str;
	}
}
