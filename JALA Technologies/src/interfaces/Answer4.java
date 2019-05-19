package interfaces;

// Implementing more than one interface.

public class Answer4 implements Answer4Interface1 , Answer4Interface2 // Can implemented multiple interfaces.
{
	public void method1() // Overriding the method from interface.
	{
		System.out.println("Hello from method1.");
	}
	
	public void method2() // Overriding the method from interface.
	{
		System.out.println("Hello from method2.");
	}
	
	public static void main(String[] args) 
	{
		Answer4 ans = new Answer4(); // Created the object of the class.
		ans.method1();// Calling the method with object.
		ans.method2();// Calling the method with object.
		
	}
}
