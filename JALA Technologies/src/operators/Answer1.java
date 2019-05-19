package operators;

import java.util.Scanner;

//Write a function for arithmetic operators(+,-,*,/)

public class Answer1 
{
	//Function defined for understanding arithmetic operators.
	public void arithmeticOperators()
	{
		Scanner sc = new Scanner(System.in); //Taking input from User using Scanner class .
		
		System.out.println("Enter the first number :");
		int x = sc.nextInt(); // Taking input first number.
		System.out.println("Enter the second number :");
		int y =sc.nextInt(); // Taking input second number.
		
		System.out.println("Performing mathematical operation.");
		
		int sum = x+y; // '+' used for addition.
		int difference = x-y ; // '-' used for subtraction.
		int multiply = x*y ; // '*' used for multiiplication.
		float divide = (float)x/y; // '/' used for division.
		
		System.out.println("On addition "+x+" and "+y+" :"+" = "+sum);
		System.out.println("On subtraction "+x+" and "+y+" :"+" = "+difference);
		System.out.println("On multiplication "+x+" and "+y+" :"+" = "+multiply);
		System.out.println("On division "+x+" and "+y+" :"+" = "+divide);
		
		sc.close();
	}
	
	public static void main(String[] args)
	{
		Answer1 ans = new Answer1();
		ans.arithmeticOperators(); // method called by creating object.
	}
}
