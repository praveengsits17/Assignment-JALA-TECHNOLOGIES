package stati;

//Call instance methods in static methods
public class Answer4 
{
	public static void printline() // static method is ben created.
	{
		System.out.println("Hello from printline method");
		
		Answer4 ans = new Answer4();
		
		ans.printName(); // calling the instance method by creating the class object.
		
		
	}
	
	public void printName() // instance method is been created.
	{
		System.out.println("Hello from the printName method.");
	}
	
	public static void main(String[]args)
	{
		printline(); // No need to create the object of class as it is a static method , accessed directly.
	}
}
