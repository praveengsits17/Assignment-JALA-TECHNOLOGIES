package operators;

import java.util.Scanner;

//Print the smaller and larger number
public class Answer7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); /*
												 * Scanner class is been used to take input from the user.
												 */

		System.out.println("Enter the first number :");
		int x = sc.nextInt(); // Taking input first number.
		System.out.println("Enter the second number :");
		int y = sc.nextInt(); // Taking input second number .
		
		if(x>y)// Comparing wether x is greater than y or not.
		{
			System.out.println(x+" is larger number");
			System.out.println(y+" is smaller number");
		}
		else // Comparing wether y is greater than x or not.
		{
			System.out.println(x+" is smaller number.");
			System.out.println(y+" is larger number.");
		}
		sc.close();
	}
}
