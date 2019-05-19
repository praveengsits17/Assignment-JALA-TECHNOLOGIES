package arrays;

//Write a function to reverse an array of integer values

import java.util.Arrays;

public class Answer9 
{
	public static void reverse(int arr[] , int n)
	{
		int new_arr[] = new int[n];//initialising new array where values are stored.
	
		int j = n ; // storing length of array in variable.
		
		for (int i = 0; i < arr.length; i++) 
		{
			new_arr[j-1] = arr[i]; // assigning the new array the elements inreverse order.
			j=j-1;
		}
	
		System.out.println("Reversed array is");
		for (int k = 0; k < n; k++) { 
            System.out.print("\t"+new_arr[k]); // tab space is been used.
        }
		
	}
	
	public static void main(String[] args) 
	{
		int arr[] = new int[]{1,3,5,7,9} ; /// Initialising array.
		System.out.println("Original array : "+Arrays.toString(arr));
		int n = arr.length;
		
		reverse(arr, n); // Static method called.
	}
}
