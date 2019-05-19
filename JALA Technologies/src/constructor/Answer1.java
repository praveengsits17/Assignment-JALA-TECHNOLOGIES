package constructor;
/*
Write a class with a default constructor, one argument constructor and two argument
constructors. Instantiate the class to call all the constructors of that class from a main
class*/

public class Answer1 
{
	public Answer1() // default constructor
	{
		System.out.println("Default constructor with no arguments.");
	}
	
	public Answer1(int x) // parameterised constructor.
	{
		System.out.println("Constructor with one argument called.");
		
	}
	
	public Answer1(int x , int y) // parameterised constructor.
	{
		System.out.println("Constructor with two parameters called.");
	}
}
