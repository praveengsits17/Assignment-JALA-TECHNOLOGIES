package loops;

import java.util.Scanner;

// Check wether Even or Odd using switch.
public class Answer11 
{
	public static void evenOrOdd()
	{
		int x ; //  value to be put in the switch case.
		
		System.out.println("Enter the number to be checked: ");
		Scanner sc = new Scanner(System.in); // Used to take input from user.
		int n = sc.nextInt();
		
		if(n%2==0) // Assigning  a value on following condition to x.
		{
			x = 1;
		}
		
		else // Assigning a value on following else condition on x.
		{
			x=2 ;
		}
	
		switch (x) 
		{
		case 1: //  For printing the even number.
			System.out.println("You entered an even number.");
			break;

		case 2: // For printing the odd number .
			System.out.println("You entered an odd number.");
			break;
			
		default: // Wrong input given by user.
			System.out.println("You did not enter any number.");
		}
		sc.close();
	
	}
	public static void main(String[] args) 
	{
		Answer11.evenOrOdd(); // evenOrOdd is a static method so no need to create class object we can access it directly by class name.
	}
	
}
