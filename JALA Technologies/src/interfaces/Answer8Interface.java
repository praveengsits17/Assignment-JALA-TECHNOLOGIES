package interfaces;

/*//Create a PUBLIC interface with fields and methods, fields should have values assigned.
Implement this interface to some class and print the values of the interface fields and
call the interface methods*/

public interface Answer8Interface
{
	public static int x = 10 ; // static variable defined
	public static int y = 20 ; // static variable defined
	
	default void printName() // default method defined.
	{
		System.out.println("I am Praveen Kumawat.");
	}
	
	default void printAge() // default method defined.
	{
		System.out.println("My age is 20.");
	}
	
}
