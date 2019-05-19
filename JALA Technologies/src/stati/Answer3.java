package stati;

//Print instance variables in static methods
public class Answer3 {
	private static int x = 30; // static variable;

	public void printline() // instance methods.
	{
		
		System.out.println("The value of static variable is " +x); // Static variables can be directly accessed by instance methods.
		
	}

	public static void main(String[] args) 
	{
		Answer3 ans = new Answer3(); // Creating object of the class
		ans.printline(); // Accessing the method by created object.
	}

}