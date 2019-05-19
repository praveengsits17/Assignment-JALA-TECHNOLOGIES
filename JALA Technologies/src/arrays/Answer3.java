package arrays;

//Write a program to find the index of an array element

public class Answer3
{
public static int findIndex(int arr[], int t) 
{ 

    
    if (arr == null)// if array is Null 
    { 
        return -1; 
    } 

    
    int len = arr.length; // find length of array 
    int i = 0;  // Initializing the variable.

    
    while (i < len) // traverse in the array
    { 

        // if the i-th element is t 
        // then return the index 
        if (arr[i] == t) 
        { 
            return i; 
        } 
        else 
        { 
            i = i + 1; // Increment the index by 1. 
        } 
    } 
    return -1; // If element not found in array return -1.
} 

// Driver Code 
public static void main(String[] args) 
{ 
    int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 }; 

    // find the index of 5 
    System.out.println("Index position of 5 is: "+findIndex(my_array, 5)); 

    // find the index of 7 
    System.out.println("Index position of 7 is: "+findIndex(my_array, 7)); 
} 
} 