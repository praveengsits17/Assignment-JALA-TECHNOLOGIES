package stati;

//Call static methods and instance methods in main method

public class Answer7 
{
	public void printline() //Instance method.
	{
		System.out.println("Hello from printline method.");
	}
	
	public static void printname() //static method.
	{
		System.out.println("Hello from printname method.");
	}
	
	public static void main(String[] args) // main method
	{
		Answer7 ans = new Answer7(); // created class object , for accessing instance methods.
		
		ans.printline(); // accessing the instance method by object.
		
		printname(); // Static methods can be accessed directly.
	}
}
