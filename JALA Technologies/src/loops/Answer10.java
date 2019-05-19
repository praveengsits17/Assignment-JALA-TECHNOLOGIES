package loops;

import java.util.*;

//Write a program to palindrome or not.

public class Answer10
{
	public static void palindrome()
	{
		System.out.println("Input a number to check palindrome or not :-");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int sum = 0 , r; // initialising the variable for sum and remainder.
		int temp = n ; // assigning variable temp equal to n. 
		   
	     while(n>0)
		   {    
	        r = n % 10; // finding out the remainder.  
	        sum = (sum*10)+r; // finding out the sum of the number by adding it to its remainder.    
	        n = n/10;// removing the last digit of tthe number.    
	       }    
	      if(temp==sum)    
	        System.out.println(temp+" is a Palindrome number.");    
	      else    
	        System.out.println(temp+" is not a Palindrome number"); 
	      
	      sc.close();
	     }  
	
	public static void main(String[]args)
	{
		Answer10.palindrome(); // palindrome is a static method so no need to create its object , directly we can access by class name.
	}
}
