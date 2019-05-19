package accessmodifiers;

//ApplicationAnswer2 class used to access the default methods and variables.

public class ApplicationAnswer2 extends Answer2 
{
	public static void main(String[] args)
	{
		ApplicationAnswer2 obj = new ApplicationAnswer2();
		
		System.out.println("Accessing the default variable from some other calss of package : "+obj.x);
		
		obj.printName(); // Accessing the default method with the help of class object. 
		
	}
}
