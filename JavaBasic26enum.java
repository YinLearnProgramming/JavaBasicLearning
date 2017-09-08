
public class JavaBasic26enum 
{
	enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATURDAY }

	public static void main(String[] args)
	{
		Day workDay = Day.WEDNESDAY;
		
		System.out.println(workDay);
		
		System.out.println("The ordinal value for " +Day.SUNDAY + " is " + Day.SUNDAY.ordinal());
		
		System.out.println("The ordinal value for " +Day.SATURDAY + " is "+ Day.SATURDAY.ordinal());
	}
}
//572