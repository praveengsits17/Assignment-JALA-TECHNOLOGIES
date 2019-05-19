package loops;

//program to print even number between 10 and 100 using while
public class Answer6 
{
	public static void whileLoop()
	{
		int i = 10; // Initialising the variable i.
		
		while(i<101) // Using the while loop.
		{
			System.out.println(i);
			i++; // Incrementing the value of the loop.
		}
	}
	
	public static void main(String[] args)
	{
		Answer6.whileLoop(); // whileLoop is a static method so no use of creating Object of class.
		 // Directly accessed by class Name.
	}
}
