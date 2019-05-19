package arrays;

//a method to find the second largest number in an array.

public class Answer13
{  
		public static int getSecondLargest(int[] a, int total)
		{  
		int temp;  
		for (int i = 0; i < total; i++)   // Traversing the array from the starting. 0th index.
		        {  
		            for (int j = i + 1; j < total; j++) // Traversing the array from index 1.   
		            {  
		                if (a[i] > a[j]) // Comparing the i'th index element in the array , with the j' th if greater so updating the value.    
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2]; // Returning the second largest element of the array.  
		}  
		public static void main(String args[])
		{  
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Largest: "+getSecondLargest(a,6));  
		System.out.println("Second Largest: "+getSecondLargest(b,7));  
		}
		}  

