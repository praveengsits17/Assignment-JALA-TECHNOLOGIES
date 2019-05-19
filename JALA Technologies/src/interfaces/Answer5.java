package interfaces;

/*Create two interfaces with the same method (same signature) in both the interfaces.
Implement these two interfaces in one class. Call the method.*/

public class Answer5 implements Answer5Interface1 , Answer5Interface2 
{

	public void method1(int x) 
	{
		
		System.out.println("Hello from method1 . Only single method is there.");
	}

	public static void main(String[] args)
	{
		Answer5 ans = new Answer5(); // Created the object of the class.
		ans.method1(10);// Pssing the argument in the method.
	}
}
