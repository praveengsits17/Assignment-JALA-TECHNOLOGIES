package exceptions;

//Handle the Arithmetic exception using try-catch block

public class Answer2 
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
			
			catch(ArithmeticException ae)
			{
				System.out.println(ae.getMessage());
			}
		}
	}

