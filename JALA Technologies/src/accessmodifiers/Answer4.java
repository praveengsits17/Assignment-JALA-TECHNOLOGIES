package accessmodifiers;

/*Create a class with PUBLIC fields and methods.
Access the public methods and fields from any class in the same package or different
package.*/

public class Answer4
{
	public int x = 100 ; // public instance variable.
	public int y = 200 ; // public instance variable.
	
	public void printName()
	{
		System.out.println("Hello from printName method.");
	}
	
	public void printLine()
	{
		System.out.println("Hello from printLine method.");
	}
	
}
