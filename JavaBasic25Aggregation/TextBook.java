package JavaBasic25Aggregation;

public class TextBook 
{
	private String title;
	private String author;
	private String publisher;
	
	public TextBook(String t, String a , String p)	
	{
		this.title = t;
		this.author = a;
		this.publisher = p;
	}
	public TextBook(TextBook obj)	
	{
		this.title = obj.title;
		this.author = obj.author;
		this.publisher = obj.publisher;
	} 
	public void set(String t, String a , String p)
	{
		this.title = t;
		this.author = a;
		this.publisher = p;
	}
	public String toString()
	{
		String str = "Title: "+ title +
					"\nAuthor: " + author +
					"\nPublisher: " + publisher;
		return str;
	}
}
