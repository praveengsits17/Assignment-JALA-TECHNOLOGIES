package arrays;

//a function to copy an array to another array

public class Answer6
{

		public static void main(String args[]) // Driver method.
		{
			int a[]={10,20,30,40,50}; // Initial array.
			int b[]=new int[a.length]; // Creating new array to be created.
			
			//copying one array to another
			for(int i=0;i<a.length;++i)
			{
				b[i]=a[i]; // assigning each value of array1 to array2.
			}
			
			//printing array
			for(int i=0;i<b.length;++i)
			{
				System.out.print(b[i]+" "); // Printing the newly formed array.
			}
		}
	
}
