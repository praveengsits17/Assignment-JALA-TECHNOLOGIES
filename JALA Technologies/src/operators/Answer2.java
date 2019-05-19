package operators;

import java.util.Scanner;

// Understanding the increment and decrement operator.

public class Answer2 {

	public void incrementDecrement() {

		Scanner sc = new Scanner(System.in); // Taking input from User using Scanner class .

		System.out.println("Enter the number :");
		int x = sc.nextInt(); // Taking input number.

		System.out.println("Initial value of x = " + x); // Initital value of x.
		int y = ++x; // using the increment operator. ++
		System.out.println("Value on incrementing = " + y);// Value on increment.

		int z = --x; // using the decrementing operator.
		System.out.println("Value on decrementing = " + z); // Value on decrement.
		
		sc.close();

	}

	public static void main(String[] args) {
		Answer2 ans = new Answer2();
		ans.incrementDecrement();
	}
}
