import java.text.DecimalFormat;
//%(flags)(width)(precision)
public class JavaBasic11Printf 
{
	public static void main(String[] args)
	{
		 double sale = 1234.45;
		 System.out.printf("the sale is %f for the day.\n",sale);
		 System.out.printf("the sale is %.2f for the day.\n",sale);
		 System.out.printf("the sale is %09.2f for the day.\n",sale);
		 double t1 = 82.6,t2 = 84.2;
		 System.out.printf("the Temperatures are %f and %f for the day.\n",t1,t2);
		 
		 int hour = 40;
		 System.out.printf("the hour is %6d for the day.\n",hour);
		 
		 //adjust
		 int num1 =123;
		 int num2 = 12;
		 int num3 = 45678;
		 int num4 = 456;
		 int num5 = 1234567;
		 int num6 = 1234;
		 System.out.printf("%-8d%-8d\n", num1, num2);
		 System.out.printf("%-8d%-8d\n", num3, num4);
		 System.out.printf("%-8d%-8d\n", num5, num6);
		 
		 //right adjust
		 String name1 = "George";
		 String name2 = "Franklin";
		 String name3 = "Jay";
		 String name4 = "Ozzy";
		 String name5 = "Carmine";
		 String name6 = "Dee";
		 System.out.printf("%10s%10s\n", name1, name2);
		 System.out.printf("%-10s%-10s\n", name3, name4);
		 System.out.printf("%10s%10s\n", name5, name6);
		 
	}
}
