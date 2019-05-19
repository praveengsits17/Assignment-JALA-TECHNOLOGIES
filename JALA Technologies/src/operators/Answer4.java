package operators;

import java.util.Scanner;

//program to find the two numbers equal or not.
public class Answer4 {
	public void equalNotEqual() {
		Scanner sc = new Scanner(System.in);     /*
												 * Scanner class is been used to take input from the user.
												 */

		System.out.println("Enter the first number :");
		int x = sc.nextInt(); // Taking input first number.
		System.out.println("Enter the second number :");
		int y = sc.nextInt(); // Taking input second number .

		if (x == y) {
			System.out.println("The two numbers are equal.");
		} else {
			System.out.println("The two numbers are not equal.");
		}
		sc.close();

	}

	public static void main(String[] args) {
		Answer4 ans = new Answer4();
		ans.equalNotEqual();

	}
}
