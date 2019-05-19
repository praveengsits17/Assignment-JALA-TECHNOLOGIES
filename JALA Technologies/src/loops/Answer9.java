package loops;

import java.util.Scanner;

//program to find the prime or not.
public class Answer9 {
	public static boolean primeOrNot() {
		Scanner sc = new Scanner(System.in); // Used to take input from user.
		System.out.println("Enter the number to be tested being Prime or not : ");
		int n = sc.nextInt(); // Value stored in n given by user.
		sc.close();

		if (n <= 1)// If value less than 1 or negative it is not prime.
		{
			return false ;
		} else 
		{
			for (int i = 2; i < Math.sqrt(n); i++) //if the given number divided by number between 2 and squareroot of itself , than it is not a prime.
			{
				if (n % i == 0) {
					return false ;
				}
				

			}
			return true;
			
		}
		
	}
	
	public static void main(String[]args)
	{
		
	boolean result =Answer9.primeOrNot(); //primeOrNot is a static method so no use of creating Object of class.
							 // Directly accessed by class Name. result is used to hold the value.
		
		if(result == false) // catching the return type in result and printing values according to it.
		{
			System.out.println("The given number is not a prime number.");
		}
		else
		{
			System.out.println("The given number is a prime number.");
		}
	}
}
