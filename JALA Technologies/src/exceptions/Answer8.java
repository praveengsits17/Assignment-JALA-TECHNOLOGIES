package exceptions;

//A program to generate Arithmetic Exception

public class Answer8 {
	public static void main(String[] args)
	{
		try 
		{
			int x , a ; // Initialising the variable.
			 x = 0; // declaring the value.
			 a = 20 ; // declaring the value.
			 int y = a/x ; // Exception occured here.
			 System.out.println(y);
		} catch (Exception e) 
		{
			System.err.println("ArithmeticException occured : "+e.getMessage()); // Printing message when Exception occured.
		}
	}
	}
