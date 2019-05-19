package constructor;

//Call the constructors(both default and argument constructors) of super class from a child
//class . Application part done in ApplicationAnswer2.

public class Answer2 
{
	public Answer2() // default constructor
	{
		System.out.println("Default constructor with no arguments from Parent class");
	}
	
	public Answer2(int x) // parameterised constructor.
	{
		System.out.println("Constructor with one argument called from Parent class");
		
	}
}
