package inheritance;

public class C extends B 
{
	public int y = 50 ;
	public int a = 60 ;
	public int b = 70 ;
	
	public void printAge() // Inherited method.
	{
		int age = 30 ;
		
		System.out.println("My age is "+age);
	}
	
	public void printState() // Inherited method.
	{
		String state = "Madhya Pradesh";
		
		System.out.println("I am from : "+state);
	}
	
	public void printProfession()
	{
		String profession = "Doctor";
		
		System.out.println("By profession : I am a "+profession);
	}
}
