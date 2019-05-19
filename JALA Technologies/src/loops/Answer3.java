package loops;

import java.util.Scanner;

//Program for equal and not equal operators.
public class Answer3 
{
	public void equalNotEqual()
	{
		Scanner sc = new Scanner(System.in); /* Scanner class is been used to take 
											  input from the user.*/
		
		System.out.println("Enter the first number :");
		int x = sc.nextInt(); // Taking input first number.
		System.out.println("Enter the second number :");
		int y =sc.nextInt(); // Taking input second number.
		
		if(x==y) // equal to operator been used .
		{
			System.out.println(x+" and "+y+" are equal.");
		}
		else if(x != y)
		{
			System.out.println(x+" and "+y+" are not equal.");
		}
		sc.close();

	}
	public static void main(String[]args)
	{
		Answer3 ans = new Answer3();
		ans.equalNotEqual();
		
	}
}
