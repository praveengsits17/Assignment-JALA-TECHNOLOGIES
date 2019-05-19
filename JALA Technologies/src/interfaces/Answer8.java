package interfaces;
/*
Create a PUBLIC interface with fields and methods, fields should have values assigned.
Implement this interface to some class and print the values of the interface fields and
call the interface methods*/

public class Answer8 implements Answer8Interface 
{
	public static void main(String[] args) 
	{
		Answer8 ans = new Answer8();
		System.out.println("x value is : "+x); // Accessing the static variable.
		System.out.println("y value is : "+y); // Accessing the static variable.
		
		ans.printAge(); // Accessing the default method by creating class object.
		ans.printName();// Accessing the default method by creating class object.
		
	}
}
