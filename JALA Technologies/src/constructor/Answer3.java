package constructor;

// Application part of this code is been seen in ApplicationAnswer3 class.

public class Answer3 
{
	public Answer3() // Can be Accessed Anywhere in the child class
	{
		System.out.println("Default Constructor. Public Access");
	}
	
	private Answer3(int x) // Can not be accessed in the child class.
	{
		System.out.println("One parameter Constructor. Private access");
	}
	
	protected Answer3(int y , int z) // 
	{
		System.out.println("Two parameter Constructor. Protected access");
	}
	
	 Answer3(int w , int x , int y , int z)
	{
		System.out.println("Three parameter Constructor. default Access");
	}
}
