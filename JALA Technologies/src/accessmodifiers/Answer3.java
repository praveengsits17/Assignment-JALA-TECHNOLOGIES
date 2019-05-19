package accessmodifiers;

/*Create a class with PROTECTED fields and methods. Access these fields and methods
from any other class in the same package.*/

public class Answer3 
{
	protected int x =30 ; // protected instance variable.
	protected int y = 45 ; //protected instance variable.
	
	protected void printName() // protected method.
	{
		System.out.println("Hello Praveen Kumawat.");
	}
	
	protected void printLine() // protected method.
	{
		System.out.println("Hello from printLine method.");
	}
}

//Access the PROTECTED fields and methods from any class in different package
// They are not accessible , only accessible by all classes of same package and subclasses of other package.