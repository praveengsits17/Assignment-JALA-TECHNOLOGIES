package arrays;

//Write a program to find the common values between two arrays

public class Answer11 {
	public static void main(String a[]) {
		int[] arr1 = { 4, 7, 3, 9, 2 }; // Initialising the first array.
		int[] arr2 = { 3, 2, 12, 9, 40, 32, 4 }; // Initialising the second array.

		for (int i = 0; i < arr1.length; i++) // Traversing thee first array.
		{
			for (int j = 0; j < arr2.length; j++) // Traversing the second array.
			{
				if (arr1[i] == arr2[j]) // Elements of the array matches we print the values.
				{
					System.out.println(arr1[i]); // Printing the repeated values.
				}
			}
		}
	}
}
