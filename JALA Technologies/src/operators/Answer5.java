package operators;

import java.util.Scanner;

//Programs on Logical AND,OR operator and Logical NOT
public class Answer5 
{
	public static boolean bln = false; // declaring boolean variable to understand logical not.
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in); /*
		 * Scanner class is been used to take input from the user.
		 */
		System.out.println("Enter the first number :");
		int x = sc.nextInt(); // Taking input first number.
		System.out.println("Enter the second number :");
		int y = sc.nextInt(); // Taking input second number .
		System.out.println("Enter the third number :");
		int z = sc.nextInt(); // Taking input third number .
		
		if(!bln) // Use of NOT operator .'!' mark is used to define it.
			// if value true it will assign false and vice-versa.
		{
		if(x==y && y==z && z==x)// Use of logical AND .
		{
			System.out.println("All the three numbers entered are equal.");
		}
		
		else if(x==y || y==z || z==x) // Use of logical OR.
		{
			System.out.println("Any of the two values entered are equal.");
		}
		
		else
		{
			System.out.println("No numbers enterd are equal.");
		}
		
		
		sc.close();
		}
		 
	}
}
