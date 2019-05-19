package methodoveloading;

//two methods with the same name but different number of parameters of different
//data type and call the methods from main method

public class Answer2 
{
	public void add(int x , int y) // Method to add two numbers.
	{
		int z = x+y ;
		System.out.println("Result on addition is : "+z);
	}
	
	public void add(String x , String y , String w) // Method to concatenate Strings with different number of parameters.
	{
		String z = x + y + w ;
		System.out.println("Result on addition is : "+z);
	}
	
	public static void main(String[] args) 
	{
		Answer2 ans = new Answer2(); // Object of class is been created.
		ans.add(60, 70); // Accessing the method.
		ans.add("My name is ","Praveen", "Kumawat"); // Accessing the overloaded method.
	}
}
