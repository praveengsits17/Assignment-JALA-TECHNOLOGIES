package interfaces;

//Create an interface with private, public and protected fields.

public interface Answer10 
{
	// protected int x = 20; // illegal access modifier for the interface can not be used.
	
	public void add(); // public method defined for the class.
	private static void subtract() // for private method we have to declare the body
	{
		int x = 30 , y = 20 ;
		int z = x - y ;
		
		System.out.println("On subtraction result is : "+z);
	}
	

	//private methods are not inherited , they are just present in the interface for the code reusability.
	
	
	
}
