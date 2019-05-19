package exceptions;

//Write a program to generate StringIndexOutOfBoundsException

public class Answer17 
{
	public static void main(String[] args) 
	{
		try 
		{
			String str = "Praveen Kumawat"; // Declaring and defining the String.
			System.out.println(str.length()); // Printing the length of the String.
			
			char ch = str.charAt(50); // Accessing the character at the following index.
			
		} 
		catch (StringIndexOutOfBoundsException e)  // Handelling the StringOutOfBound Exception
		{
			e.printStackTrace();
		}
	}
}
