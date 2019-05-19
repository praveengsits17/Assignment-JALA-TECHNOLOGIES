package exceptions;

//Write a program to throw exception with your own message

public class Answer5 
{
	public static void main(String[] args) 
	{
		try {
		int arr[] = new int[2]; // Declaring the array.
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		
		System.out.println(arr[3]); // Accessing the index which is not present in the array.
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("ArrayIndexOutOfBound . Handelled by user.");
		}
		
		
		}
}
