package methodoveloading;

//two methods with the same name and same number of parameters of same type
//and call from main method

public class Answer3 
{
	public void add(int x , int y) // Method to add two numbers.
	{
		int z = x+y ;
		System.out.println("Result on addition is : "+z);
	}
	
	public void add(String w , String x) // Method to add two numbers.
	{
		int i = Integer.parseInt(w);
		int j = Integer.parseInt(x);
		int k = i+j;
		
		System.out.println("Result on addition is : "+k);
	}
	
	public static void main(String[] args) 
	{
		Answer3 ans = new Answer3(); // Object of class is been created.
		ans.add(60, 70); // Accessing the method.
		ans.add("60", "50");
		
		
	}
}