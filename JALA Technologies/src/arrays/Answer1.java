package arrays;
//a function to add integer values of an array
public class Answer1 
{
	public static void sumArray(int arr[])
	{
		int sum = 0 ; // Initialising the value of sum to be zero.
		
		for (int i = 0; i < arr.length; i++) // Using the for loop to iterate over the array. 
		{
			sum = sum +arr[i]; // adding the elements of the array.
		}
		System.out.println("Sum of elements of array is :"+sum);
	}
	
	public static void main(String[]args)
	{
		int arr[]  = new int[] {1 ,3 ,5, 7,9}; // Initialising and defining an array. 
		
		Answer1.sumArray(arr); // sumArray is a static method so no need of creating its object.
							   // By class name we can access the methods.
	}
	
}
