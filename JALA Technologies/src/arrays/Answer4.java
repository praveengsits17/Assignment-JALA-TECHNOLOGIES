package arrays;

//Write a function to test if array contains a specific value

public class Answer4 
{
	public static boolean contains(int my_array[] , int item)
	{
		for (int n : my_array) // iterating over the whole array
		{
			if(item == n) // if item found in array , return true.
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		int my_array [] = new int[] {1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2265, 1457, 2456};
	
		System.out.println(contains(my_array, 1254)); // Method testing wether following key present in array or not.
		System.out.println(contains(my_array, 2013)); // Method testing wether following key present in array or not.
		
	}
}
