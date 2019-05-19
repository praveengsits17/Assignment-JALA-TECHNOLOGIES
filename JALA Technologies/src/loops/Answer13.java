package loops;

//program to print largest among 10 ,20 and 30. Using multiple if else statement.
public class Answer13 
{	
		public static void largestInThree(int x , int y , int z)
		{
			
			if(x>y && x>z)// Logic used when x is largest among the three numbers.
			{
				System.out.println(x+" is the largest number entered.");
			}
			
			else if(y>x && y>z)// Logic used when y is largest among the three numbers.
			{
				System.out.println(y+" is the largest number entered.");
			}
			
			else if(z>x && z>y)// Logic used when x is largest among the three numbers.
			{
				System.out.println(z+" is the largest number entered.");
			}
		}
		
		public static void main(String[] args) 
		{
			Answer13.largestInThree(10 ,20 ,30); // largestInThree is a static method so no use of creating Object of class.
			 // Directly accessed by class Name. Passing the parameters in the function.
		}
	}


