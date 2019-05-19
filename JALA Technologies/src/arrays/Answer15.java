package arrays;

//Write a function to reverse an array of integer values

import java.util.Arrays;

public class Answer15 
{
	public static void main(String[] args)
	 {
	    int[] array_nums = {5, 7, 2, 4, 9}; // initialising array
		System.out.println("Original Array: "+Arrays.toString(array_nums)); //Printing the given array. 
		int ctr = 0; // Initialising a variable equal to 0.
		for(int i = 0; i < array_nums.length; i++)
		{
			if(array_nums[i] % 2 == 0) // if number is even.
				ctr++; // We increment the ctr variable by 1.
		}
		System.out.println("Number of even numbers : "+ctr); // total even numbers.
		System.out.println("Number of odd numbers  : "+(array_nums.length-ctr)); // // total odd numbers.
	 }
}
