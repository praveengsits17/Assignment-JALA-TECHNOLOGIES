package arrays;

public class Answer2 
{
	public static void averageArray(int arr[])
	{
		int sum = 0 ; // Initialising the value of sum to be zero.
		
		for (int i = 0; i < arr.length; i++) // Using the for loop to iterate over the array. 
		{
			sum = sum +arr[i]; // adding the elements of the array.
		}
		
		float result =(float)sum/arr.length; // finding the average of sum , dividing by array length.
		System.out.println("Average value of elements of array is :"+result);
	}
	
	public static void main(String[]args)
	{
		int arr[]  = new int[] {1 ,3 ,5, 7,9,6}; // Initialising and defining an array. 
		
		Answer2.averageArray(arr); // sumArray is a static method so no need of creating its object.
							   // By class name we can access the methods.
	}
}
