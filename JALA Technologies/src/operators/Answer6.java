package operators;

import java.util.Scanner;

//program for relational operators (<,<==, >, >==)

public class Answer6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); /*
												 * Scanner class is been used to take input from the user.
												 */

		System.out.println("Enter the first number :");
		int x = sc.nextInt(); // Taking input first number.
		System.out.println("Enter the second number :");
		int y = sc.nextInt(); // Taking input second number .
		
		if(x<y) // use of less than operator.
		{
			System.out.println(x+" is less than "+y+".");
		}
		else if(x<=y) // use of less than equal to operator.
		{
			System.out.println(x+" is less than equal to "+y+".");
		}
		else if(x>y) // use of greater than operator.
		{
			System.out.println(x+" is greater than "+y+" .");
		}
		else if(x>=y) // use of greater than equal to operator.
		{
			System.out.println(x+" is greater than equal to "+y+" .");
		}
		sc.close();
	}
}
