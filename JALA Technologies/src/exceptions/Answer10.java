package exceptions;

// A program to generate ClassNotFoundException

public class Answer10 
{
	public static void main(String[] args)
	{
		try 
		{
			Class.forName("org.source.praveen.Application"); // Method is used to find the class name at following path.
		} catch (Exception e) 
		{
			System.err.println("ClassNotFound exception occured."+e.getMessage()+" does not exist.");
		}
	}
}
