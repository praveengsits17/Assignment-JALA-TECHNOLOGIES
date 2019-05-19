package exceptions;

//Write a program to generate NoSuchFieldException

import java.lang.reflect.*;

public class Answer13 {
	public static void main(String[] args) {
		Answer13 ans = new Answer13(); // Object of class is created.
		Class cls = ans.getClass(); // Class is used.

		System.out.println("Field : ");

		try {
			Field field = cls.getField("string2"); // Accessed the field which is not present in the class
			System.out.println("Public field found: " + field.toString());
		} catch (NoSuchFieldException e) 
		{
			System.out.println(e.toString()); // Converting the given message to string
		}
	}
	
	public Answer13()
	{
		// Default constructor
	}
	
	public Answer13(String string1)
	{
		this.string1 = string1; // Assigning the value of the String.
	}
	
	public String string1 = "PraveenKumawat"; // Declared a public string1.
}