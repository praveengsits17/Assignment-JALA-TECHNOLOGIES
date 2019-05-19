package inheritance;

public class A 
{
	public int x = 10 ; // For run time polymorphism.
	public int y = 20 ; // For run time polymorphism.
	public int z = 30 ;
	
		
	public void printName() // Class Method
	{
		String str = "Praveen Kumawat";
		
		System.out.println("My Name is "+str);
	}
	
	public void printAge() //Class Method
	{
		int age = 20 ;
		
		System.out.println("My age is "+age);
	}
	
	public void printCountry() // Class method.
	{
		String country = "India";
		System.out.println("I am from : "+country);
	}
	
}
