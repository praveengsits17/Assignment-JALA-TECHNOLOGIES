package interfaces;

/*Create an interface with a default method and implement it in a class. Do not provide
implementation to the default method and call the method.
*/
public class Answer6 implements Answer6Interface 
{
	public static void main(String[] args) 
	{
		Answer6 ans = new Answer6(); // creating the object of the class.
				ans.printline(); // Accessing the default method.
		
	}
}
