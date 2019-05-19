package methodoveloading;

//two methods with the same name, number of parameters and data type but
//different return Type.

public class Answer5 
{
	public void addNumbers(int x , int y) // Method used for addition of numbers.
	{
		int z = x + y ;
		System.out.println("On addition result is : "+z);
	}
	
	public int addNumbers(String w , String x) // Method used for addition of numbers.
	{
		int k = Integer.parseInt(w); // Converting from String to integer.
		int l = Integer.parseInt(x); // Converting from String to integer.
		
		return (k+l);
	}
	
	public static void main(String[] args) 
	{
		Answer5 ans = new Answer5();
		ans.addNumbers(100, 200); // Method is called.
		
		int p = ans.addNumbers("3782", "4808"); // the value of return type stored in an integer.
		
		System.out.println("On addition result is : "+p);
		
		
	}
}
