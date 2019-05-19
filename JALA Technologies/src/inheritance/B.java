package inheritance;

public class B extends A
{
	public int x = 40;
	public int y = 50;
	public int a = 60;
	
	public void printName() // Inherited method.
	{
		String str = "Dheeraj Kumawat";
		
		System.out.println("My Name is "+str);
	}
	
	public void printAge() // Inherited method.
	{
		int age = 25 ;
		
		System.out.println("My age is "+age);
	}
	
	public void printState() // Class method.
	{
		String state = "Madhya Pradesh";
		
		System.out.println("I am from : "+state);
	}
}
