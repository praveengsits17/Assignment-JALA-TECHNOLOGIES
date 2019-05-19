package javabasics;

// Calling printName function from main metod.
public class Answer6 
{
	// Method used for setting up the name .
	public void printName()
	{
		System.out.println("Name:- PRAVEEN KUMAWAT");
	}
	
	public static void main(String[] args) 
	{
		Answer6 ans = new Answer6(); // Creating the object of the class.
		
		ans.printName(); // Calling the method by creating the object .
	}
}
