package loops;

import java.util.Scanner;

// gender (Male/Female) program according to given M/F using switch.
public class Answer12 {
	public static void gender() // Method for finding the gender. 
	{
		System.out.println("Please enter your gender as (M/F)");
		Scanner sc = new Scanner(System.in);// Taking input from user.
		String ch = sc.nextLine(); // Storing the input in the form of String.
		sc.close();

		switch (ch) {
		case "M": // case for male.
			System.out.println("You are a male");
			break;
		case "F": // case for female.
			System.out.println("You are a female");
			break;
		default: // default case when no above case executed.
			System.out.println("You entered a wrong input.");
			break;

		}
	}
	
	public static void main(String[] args)
	{
		Answer12.gender(); // gender is a static method , so no need to create object of class , directly we can access it by class name.
	}
	
}
