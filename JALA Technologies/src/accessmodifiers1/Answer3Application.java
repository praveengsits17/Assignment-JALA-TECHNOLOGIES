package accessmodifiers1;
import accessmodifiers.*;

/*Access the PROTECTED fields and methods from child class located in a different
package*/

public class Answer3Application extends Answer3 
{
	public static void main(String[] args)
	{

		Answer3Application ans = new Answer3Application();
		
		System.out.println("Accessing protected variable x from different package : "+ans.x);
		System.out.println("Accessing protected variable y from different package : "+ans.y);
		
		ans.printLine();//Accessing protected method from different package.
		ans.printName();//Accessing protected method from different package .
	}
}
