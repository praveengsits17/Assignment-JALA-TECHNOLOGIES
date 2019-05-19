package arrays;

//Write a method to remove duplicate elements from an array
public class Answer12 {
	public static int removeDuplicateElements(int arr[], int n) {
		if (n == 0 || n == 1) // if there are 0 or no elements in array , no possibility of duplicate so
								// return.
		{
			return n;
		}
		int j = 0;// for next element
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) // Comparing the element with its next element as it is a sorted array.
			{
				arr[j++] = arr[i]; // if values different assign the value to the index.
			}
		}
		arr[j++] = arr[n - 1];// last element n-1 , is positioned at the last position of array because after
								// that no , duplicate possible.
		return j; // Returning the new length of array after removing the elements.
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 }; // Sorted array
		int length = arr.length; // length of array
		length = removeDuplicateElements(arr, length); // new length
		// printing array elements
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
	}
}
