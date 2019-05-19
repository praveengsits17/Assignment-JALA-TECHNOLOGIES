package exceptions;

//A program to generate ArrayIndexOutOfBoundException

public class Answer9 
{
	public static void accessArray()
	{
		int arr[] = new int[2]; // Declaring the array.
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		
		System.out.println(arr[3]); // Accessing the index which is not present in the array.
		
	}
	
	
	public static void main(String[] args)
	{
		try
		{
		accessArray(); // Accessing the static method , Exception in the method.
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.err.println("ArrayIndexOutOfBound Exception occured :"+ae.getMessage());
		}
	}
}
