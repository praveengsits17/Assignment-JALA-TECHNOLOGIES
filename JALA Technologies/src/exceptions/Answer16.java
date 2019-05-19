package exceptions;

//A program to generate NumberFormatException

public class Answer16 
{
	public static void main(String[] args)
	{
		try {
		String s = "PraveenKumawat";
		int i = Integer.parseInt(s); // Exception occured here. // Converting String into integers.
		
		System.out.println("int value : "+i); // Code never reached here , Exception occured here.
		}
	catch (NumberFormatException n)
		{
			n.printStackTrace(); // Detailed information about the Exception.
		}
	
	}
}
