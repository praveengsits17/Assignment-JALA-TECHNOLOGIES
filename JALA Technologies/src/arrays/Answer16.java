package arrays;

//Write a function to get the difference of largest and smallest value

import java.util.Arrays;

public class Answer16 
{
	public static void main(String[] args) 
	{
		int[] array_nums = {5, 7, 2, 4, 9}; // Initialising the array
		System.out.println("Original Array: "+Arrays.toString(array_nums)); // Method used to print the array. 
	
		int max_val = array_nums[0]; // initialised max_value.
		int min_val = array_nums[0]; // initialised min_value.
		
		for(int i = 1; i < array_nums.length; i++)
		{
			if(array_nums[i] > max_val) // if at any instant if the value at any index bigger or smaller values updated.
				max_val = array_nums[i];
			else if(array_nums[i] < min_val)
				min_val = array_nums[i];
		}
		System.out.println("Difference between the largest and smallest values of the said array: "+(max_val-min_val));
	
	}
}
