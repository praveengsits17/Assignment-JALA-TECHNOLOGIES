package accessmodifiers;

//used for accessing the Answer3 class . For application purpouse.

public class Answer3Application extends Answer3
{
	public static void main(String[] args)
	{

		Answer3Application ans = new Answer3Application();
		
		System.out.println("Accessing protected variable x from same package : "+ans.x);
		System.out.println("Accessing protected variable y from same package : "+ans.y);
		
		ans.printLine();//Accessing protected method from same package but different class.
		ans.printName();//Accessing protected method from same package but different class.
	}
	
}
