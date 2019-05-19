package loops;

import java.util.Scanner;

//program to print largest number among three numbers.
public class Answer5 
{
	public static void largestInThree()
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
		
		if(x>y && x>z)// Logic used when x is largest among the three numbers.
		{
			System.out.println(x+" is the largest number entered.");
		}
		
		else if(y>x && y>z)// Logic used when y is largest among the three numbers.
		{
			System.out.println(y+" is the largest number entered.");
		}
		
		else if(z>x && z>y)// Logic used when x is largest among the three numbers.
		{
			System.out.println(z+" is the largest number entered.");
		}
		sc.close();
	}
	
	public static void main(String[] args) 
	{
		Answer5.largestInThree(); // largestInThree is a static method so no use of creating Object of class.
		 // Directly accessed by class Name.
	}
}
