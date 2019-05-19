package accessmodifiers1;

//Access the public methods and fields from any class in the same package or different
//package.

import accessmodifiers.Answer4;

public class Answer4Application extends Answer4 
{
	public static void main(String[] args)
	{
		Answer4Application ans = new Answer4Application();
		
		ans.printLine(); // Accessing the public methods from the different package
		ans.printName();  // Accessing the public methods from the different package.
		
		System.out.println("Value of variable x is : "+ans.x); // Accessing the public variable from the different package.
		System.out.println("Value of variable y is : "+ans.y); // Accessing the public variable from the different package.
	}
}
