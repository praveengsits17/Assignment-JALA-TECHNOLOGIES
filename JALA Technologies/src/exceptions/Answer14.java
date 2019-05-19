package exceptions;

 //A program to generate NoSuchMethodException

import java.lang.reflect.*;

public class Answer14 
{
	public Answer14()
	{
		Class cls ; // Object been created.
		
		try 
		{
			cls = Class.forName("java.lang.String"); // Using the String class for the methods.
			
			try
			{
				Class[]param = new Class[5]; // Creating an array.
				
				Method m = cls.getDeclaredMethod("fooMethod", param); // NoSuchMethod found
			} 
			catch (NoSuchMethodException e) 
			{
				e.printStackTrace(); //Printing the ExceptionOccured.
			}
			
		} catch (Exception e) 
		{
			
		}
		
	}
	
	public static void main(String[] args) 
	{
		new Answer14(); // Instantiating Answer14 class ;
	}
}
