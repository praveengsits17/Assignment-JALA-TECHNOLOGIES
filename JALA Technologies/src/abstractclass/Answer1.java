package abstractclass;

//Create an abstract class with abstract and non-abstract methods.

public abstract class Answer1 
{
	public abstract void printName(); // abstract method.
	public abstract void printState();// abstract method.
	
	public static void printGender() // non-abstract method.
	{
		System.out.println("I am a boy");
	}
	public static void printAge() // non-abstract metho.
	{
		System.out.println("I am 20 year Old");
	}
	
}
