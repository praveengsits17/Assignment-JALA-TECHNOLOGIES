package loops;

import java.util.Scanner;

//program to print the odd and even numbers.
public class Answer4 
{
	public static void evenOdd()
	{
		System.out.println("Enter the number to be checked if it is Even or Odd.");
		Scanner sc = new Scanner(System.in); // Used for taking input from user.
		int x = sc.nextInt(); //Integer to be checked wether even or Odd.
		
		if(x%2 == 0) // Modulus operator is used. Gives the remainder.
		{
			System.out.println(x+" is a Even number.");
		}
		
		else
		{
			System.out.println(x+" is a Odd number.");
		}
		
		sc.close();
	}
	
	public static void main(String[] args) 
	{
		Answer4.evenOdd(); // evenOdd is a static method so no use of creating Object of class.
							 // Directly accessed by class Name.
	}
	
	
}
