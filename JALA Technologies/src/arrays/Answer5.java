package arrays;

//Write a function to remove a specific element from an array

public class Answer5 {
	public static int deleteElement(int arr[], int n, int x) // element to be deleted is x ;
	{
		// Search x in array
		int i;
		for (i = 0; i < n; i++)
			if (arr[i] == x) // if element found in the array break out through the array.
				break;

		// If x found in array
		if (i < n) {
			// reduce size of array and move all
			// elements on space ahead
			n = n - 1; // as one of the element from the array is removed.
			for (int j = i; j < n; j++)
				arr[j] = arr[j + 1]; // shifting each rightside of deleted element to the left side.
		}

		return n; // if not found the element return n , as this index is not present in the array.
	}

	 public static void main(String[] args) 
	    { 
	        int arr[] = {11, 15, 6, 8, 9, 10}; 
	        int n = arr.length; 
	        int x = 6; 
	   
	        // Delete x from arr[] 
	        n = deleteElement(arr, n, x); // method called to delete the element
	   
	        System.out.println("Modified array is"); 
	        for (int i = 0; i < n; i++) 
	            System.out.print(arr[i]+" "); // After deleting the element from the array.
	          
	    } 
	} 


