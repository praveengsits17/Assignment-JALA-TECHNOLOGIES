package interfaces;

//Create a PRIVATE or PROTECTED interface and print the values as above scenario

public class Answer9 {

	private interface Answer9Interface // private interface created. 
	{

		public static int x = 10 ; // static variable defined
		public static int y = 20 ; // static variable defined
		
		 static void printName() // default method defined.
		{
			System.out.println("I am Praveen Kumawat.");
		}
		
		static void printAge() // default method defined.
		{
			System.out.println("My age is 20.");
		}
	}
	
	public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, SecurityException
	{
	
		System.out.println("The value of x from Interface is : "+Answer9.Answer9Interface.x) ; //accessing the variables of the private Interface.
		System.out.println("The value of y from Interface is : "+Answer9.Answer9Interface.y);//accessing the variables of the private Interface.
	
		Answer9.Answer9Interface.printName(); // accessing the method from the function.
		Answer9.Answer9Interface.printAge(); // accessing the method from the function.
	}
	
	
	
}
