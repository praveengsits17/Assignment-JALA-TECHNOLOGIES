package accessmodifiers;

/*Create a class with PRIVATE fields, private method and a main method. Print the fields
in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from sub class.
*/

public class Answer1 
{
	private static int x = 33 ; // private class variables.
	
	private static void prinLine() // private method in the class.
	{
		System.out.println("Hello from printLine Method.");
	}
	
	public static void main(String[] args) 
	{
		prinLine(); // No need of creating the object of class as it is a static method. Directly accessible.
		System.out.println("Value of x is : "+x); // No need of creating the object of class as it is a static variable. Directly accessible.
		
	}
	
}
