package inheritance;

// class with main method .

public class MainClass 
{
	public static void main(String[] args) 
	{
		A objA = new A();
		B objB = new B();
		C objC = new C();
		
		//Accessing class A methods with its object.
		
		objA.printName();
		objA.printAge();
		objA.printCountry();
		
		System.out.println(); //LineBreak.
		
		//Accessing class B methods with its object.

		objB.printName();
		objB.printAge();
		objB.printState();
		
		System.out.println(); //LineBreak.
		
		//Accessing class C methods with its object.
	
		objC.printAge();
		objC.printState();
		objC.printProfession();
		
		System.out.println(); //LineBreak.
		
		//Call an overridden method with super class reference to B and C class’s objects.
		
		A obj = new B(); // As Parent can hold the the object of the child.
		
		obj.printName(); // Called the overriden method with the reference object of class A.
		obj.printAge(); //  Called the overriden method with the reference object of class A.
		
		System.out.println();
		
		// Runtime Polymorphism with Data Members/Instance variables, Repeat the above
		//process only for data members
		
		A obj1 = new B();
		
		System.out.println("Overriden value of x from class B "+obj1.x);
		System.out.println("Overriden value of y from class B "+obj1.y);
		
		//=====================================================================
		
		A obj2 = new C();
		

		System.out.println("Overriden value of z from class C "+obj2.y);
		
		System.out.println();
		
		//======================================================================
	}
}
