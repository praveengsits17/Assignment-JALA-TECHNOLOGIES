package arrays;
import java.util.*; 

//Write a method to verify if the array contains two specified elements(12,23)
public class Answer17
{
	 
	 public static void main(String[] args)
	 {
	    int[] array_nums = {14,62,12,19,7,23}; // initialising Array .
		System.out.println("Original Array: "+Arrays.toString(array_nums)); // Converted the array toString. 
		int num1 = 23;
	    int num2 = 12;
		
		System.out.println("Result: "+result(array_nums, num1, num2)); // if contains returns a boolean value
	    }	
	  
	  public static boolean result(int[] array_nums, int num1, int num2) // numbers searched in the array
	  {
		  for (int number : array_nums) 
		  {
		      boolean r = number != num1 && number != num2; // comapring with each number if both satisfy overall condition satisfies.
		      if (r) 
		        {
		        return true; // find the number so return boolean as true
		        }
		     }
		        return false;

	  }
}
