package arrays;
//a function to find the missing number of sorted array of 1 to 100
public class Answer19 
{
	public static int getMissing(int arr[] , int n) // method for finding the missing number.
	{
		int i , total ;
		total = (n+1)*(n+2)/2 ; // Sum of numbers between 1 to 100 , formulae is used.
		
		for ( i = 0; i < arr.length; i++) 
		{
			total -= arr[i]; // Subtracting number after every iteration . The last remaining number will be present in the total.
		}
		return total ;
	}
	
	
	public static void main(String[] args) // Driver method.
	{
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};//initialising the array.
		int n = arr.length; // finding length of the array
		
		int missing = getMissing(arr , n); // missing holds the returned value.
		
		System.out.println("The mising number is : "+missing);
		
	}
}
