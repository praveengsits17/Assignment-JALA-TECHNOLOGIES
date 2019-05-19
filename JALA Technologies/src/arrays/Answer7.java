package arrays;

import java.util.Arrays;

//Write a function to insert an element at a specific position in the array

public class Answer7 
{
		 
		public static void main(String[] args)  // Driver method. 
		{

		   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}; // Initialising an array.

		    // Insert an element in 3rd position of the array (index->2, value->5)
		   
		   int Index_position = 2;
		   int newValue    = 5;

		  System.out.println("Original Array : "+Arrays.toString(my_array)); // Printing the original array    
		   
		  for(int i=my_array.length-1; i > Index_position; i--) //  Traversing from back to front.
		  {
		    my_array[i] = my_array[i-1]; // Putting the element at the given position.
		   }
		   my_array[Index_position] = newValue; // new Value is assigned at the index.
		   System.out.println("New Array: "+Arrays.toString(my_array));
		 }
		 
		 
}
