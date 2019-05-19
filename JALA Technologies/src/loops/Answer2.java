package loops;

//Write a java program to print 1 to 20 numbers using the while loop.

public class Answer2 
{
	public static void whileLoop()
	{
		int i = 1 ; // initialising the variable used in while loop .
		
		while(i<21) // while loop
		{
			System.out.println(i);
			i++; // incrementing the parameter i.
		}
				
	}
	
	public static void main(String[]args)
	{
		Answer2.whileLoop(); // whileLoop is a static method so no use of creating Object of class.
							 // Directly accessed by class Name.
	}
}
