package JavaBasic33Date;
import java.util.StringTokenizer;
public class DateComponent 
{
	private String month;   // To hold the month
	private String day;     // To hold the day
	private String year;    // To hold the year
	
	public DateComponent(String dateStr)
	{
		StringTokenizer strTokenizer = new StringTokenizer(dateStr, "/");

	    month = strTokenizer.nextToken();
	    day = strTokenizer.nextToken();
	    year = strTokenizer.nextToken();      
	}
	
	public String getMonth()
	{
	    return month;
	}
	
	public String getDay()
	{
	    return day;
	}
	
	public String getYear()
	{
	    return year;
	}
}
