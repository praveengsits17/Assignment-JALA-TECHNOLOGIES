package exceptions;

//A program with multiple catch blocks

public class Answer4 
{
	public static void main(String[]args)
	{
		try
		{
		int x = 0 ; // Initializing the value of x.
		
		int a = 20 ; // Initializing the value of a.
		
		int y = a /x ; // Arithmetic exception happened.
		
		
		System.out.println(y); // will not execute this code.
		}
		
		catch(ArithmeticException ae) // catch block 1
		{
			System.out.println(ae.getMessage());
		}
		
		catch (Exception e) // catch block 2.
		{
			System.out.println(e.getMessage());
		}
}
}
