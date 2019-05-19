package exceptions;

//A program to create your own exception
public class Answer7 
{
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
			System.err.println(e.getMessage()); // Printing message when Exception occured.
		}
		finally // finally block used.
		{
			System.out.println("This block of code will always run.");
			System.out.println("If you are not sure that code will run or not put it in finally block");
		}
	}
}
