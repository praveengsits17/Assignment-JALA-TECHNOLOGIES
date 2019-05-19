package arrays;

//Write a function to find the duplicate values of an array

public class Answer10 {
	public static void main(String[] args) // Driver Method.
	{
		int[] my_array = { 1, 2, 5, 5, 6, 6, 7, 2 }; // Initialising the array.

		for (int i = 0; i < my_array.length - 1; i++) // Traversing the array from starting index 0
		{
			for (int j = i + 1; j < my_array.length; j++) // Traversing from the second element .
			{
				if ((my_array[i] == my_array[j]) && (i != j)) // if value repeats , so duplicate is found.
				{
					System.out.println("Duplicate Element : " + my_array[j]);// Printing the duplicate value from the
																				// array.
				}
			}
		}
	}
}
