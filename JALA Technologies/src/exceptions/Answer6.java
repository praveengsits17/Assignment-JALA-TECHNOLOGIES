package exceptions;

//A program to create your own exception

//A Class that represents user-defined expception
class MyException extends Exception
{
	

	public MyException(String s)
	{
		// Call constructor of parent Exception 
		super(s);
	}
}
//A Class that uses above MyException 
public class Answer6
{
	public static void main(String[] args)
	{
		try 
		{
			// Throw an object of user defined exception
			throw new MyException("Excception Occured.");
		}
		catch (MyException e) 
		{
			System.out.println("In catch block.");
			// Print the message from MyException object
			System.out.println(e.getMessage());
		}
	}
}