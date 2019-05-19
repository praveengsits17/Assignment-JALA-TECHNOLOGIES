package methodoveloading;

//Two methods with the same name but different number of parameters of same type
//and call the methods from main method

public class Answer1 
{
	public void add(int x , int y) // Method with two parameters ;
	{
		int z = x +y ;
		System.out.println("Result on addition is : "+z);
	}
	
	public void add(int x , int y , int z) // Overloaded method.
	{
		int w = x+y+z;
		System.out.println("Result on addition is : "+w);
	}
	
	public static void main(String[] args)
	{
		Answer1 ans = new Answer1(); // Object of class is been created to access instance method.
		
		ans.add(10, 90);
		ans.add(10, 50, 50);
	}
	
}
