package stati;

//Call static methods in instance methods

public class Answer5 
{
	public void printline() // static method is ben created.
	{
		System.out.println("Hello from printline method");
		
		printName(); // No need to create object , static methods can be accessed directly from instance methods.
		
	}
	
	public static void printName() // instance method is been created.
	{
		System.out.println("Hello from the printName method.");
	}
	
	public static void main(String[]args)
	{
		Answer5 ans = new Answer5(); // Creating the class Object.
		ans.printline(); // as printline is a instance method so object is been created to access it.
	}
}
