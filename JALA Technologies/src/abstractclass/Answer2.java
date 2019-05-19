package abstractclass;
/*
Create a sub class for an abstract class. Create an object in the child class for the
abstract class and access the non-abstract methods*/

public class Answer2 extends Answer1 {

	public void printName() // abstract method necessary to override in subclass.
	{
		System.out.println("I am Praveen Kumawat");
	}

	public void printState()// abstract method necessary to override in subclass.
	{
		System.out.println("I am from Madhya Pradesh state.");
	}

	public static void main(String[] args) 
	{
		
		printAge(); // make the non abstract method static we can use them directly.
		printGender(); // make the non abstract method static we can use them directly.
		
		// No need to create the object of abstract class.	

	}
}
