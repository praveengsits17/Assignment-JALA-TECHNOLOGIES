package javabasics;

// Understanding the difference between global and local variable.
public class Answer5 
{
	public static int x = 20 ; // Global variable.
	
	public static void printNumber()
	{
		int x = 30 ; // Local variable.
		System.out.println("Value of x defined locally "+x); 
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Value of x defined globally "+x);
		
		Answer5.printNumber();
	}
}
//Local variables :- It scope is inside the method or the block in which it is defined.
/*Global variable :- This are also called as class variables.Can be accessed by each 
and every method of class*/