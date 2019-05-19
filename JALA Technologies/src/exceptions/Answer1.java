package exceptions;

//a program to generate Arithmetic Exception without exception handling
public class Answer1 
{
	public static void main(String[]args)
	{
		int x = 0 ; // Initializing the value of x.
		
		int a = 20 ; // Initializing the value of a.
		
		int y = a /x ; // Arithmetic exception happened.
		
		System.out.println(y); // will not execute this code.
		
	}
}
