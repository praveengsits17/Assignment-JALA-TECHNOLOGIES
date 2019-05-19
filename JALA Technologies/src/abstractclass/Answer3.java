package abstractclass;
/*
Create an instance for the child class in child class and call abstract methods*/

public class Answer3 extends Answer1
{
	public void printName() 
	{
		System.out.println("My name is PRAVEEN KUMAWAT");
		
	}

	public void printState() 
	{
		
		System.out.println("I am from Madhya Pradesh state.");
		
	}

	public static void main(String[] args) 
	{
		Answer3 ans = new Answer3();
		
		ans.printName(); // accessing the abstract method by creating the class object.
		ans.printState(); //accessing the abstract method by creating the class object.
	}
}
