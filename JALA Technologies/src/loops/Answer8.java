package loops;

//Write a program to find Armstrong number or not

import java.util.*;

public class Answer8 {
	public static void armstrongNumber() {
		int c = 0, a, temp; // declaring the three integers.

		Scanner sc = new Scanner(System.in); // Used to take input from user .
		System.out.println("Enter the number entered to be Armstrong or not :");
		int n = sc.nextInt(); // Checking the number to be armstrong or not.

		temp = n;

		while (n > 0) {
			a = n % 10; // Finding the unit's digit place.
			n = n / 10; // Removing the unit's digit from number.
			c = c + (a * a * a); // Cube the unit's digit value and adding it in previous result.
		}
		if (temp == c) // Checking the condition for armstrong
		{
			System.out.println("The given number is a armstrong number");
		} else {
			System.out.println("The given number is not an armstrong number");

		}
		sc.close();
	}

	public static void main(String[] args) 
	{
		Answer8.armstrongNumber(); //armstrongNumber is a static method so no use of creating Object of class.
		// Directly accessed by class Name.
	}

}
