package exceptions;
//a program to generate NullPointerException

public class Answer15 
{
	public static void main(String[] args)
	{
		String ptr = null ; // Initialised the String
		
		try
		{
			if(ptr.equals("Praveen")) // equals method is been called
				System.out.println("Same String.");
			
			else		
				System.out.println("Different String");

		}
		catch(NullPointerException n)
		{
			n.printStackTrace(); // Gives the complete detail what type of Exception occured.
		}
		
	}
	
}
