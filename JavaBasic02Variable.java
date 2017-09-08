/**
 * variable
 * second day of Java
 * 2013
*/
public class JavaBasic02Variable 
{
	public static void main(String[] args)
	{
		int workingHours = 40;	//integer
	 	double pay, payRate = 25.0; //double, other primitive data types: byte<short<int <long <float, double
	 	int books = 15,        // Number of books to read
	 	    months = 6;        // Number of months to read them
	    double booksPerMonth;  // Average books per month
	    char letter;	//letter, must use ''
	    boolean bool; // only true or false
	    
	    bool = true;
	    System.out.println("it is " + bool);
	    bool = false;
	    System.out.println("it is "+ bool);
	    
	  	pay = workingHours * payRate;
	  	System.out.println("Your gross pay is $" + pay);
	  	System.out.print("I plan to read ");
        System.out.print(books + " books in ");
        System.out.println(months + " months.");
        
        booksPerMonth = (double) books / months;
        System.out.print("I will read an average of ");
        System.out.print(booksPerMonth);
        System.out.println(" books per month.");
        
        letter = 'A';
        System.out.println(letter);
        letter = 'B';
        System.out.println(letter);
	}
}
