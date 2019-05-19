package constructor;

//call the constructor multiple times with the same object
// With thee help of loop we can access the same constructor multiple number of times.
public class Answer5 
{
	public Answer5() // Default constructor created.
	{
	
		System.out.println("Default Constructor.");
	}
	
	public static void main(String[] args) 
	{	
		int x = 0; // Initialising the variable.
		
		while(x<10)
		{
			Answer5 ans = new Answer5(); // Same object , constructor called again and again.
			x++;
		}
		
	}
}
