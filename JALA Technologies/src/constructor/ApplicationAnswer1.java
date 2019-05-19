package constructor;

// Application class for Answer1.

public class ApplicationAnswer1 extends Answer1
{
	public static void main(String[] args) 
	{
		Answer1 ans = new Answer1() ; // whenever object of class created its constructor is called.
		Answer1 ans1 = new Answer1(10); // whenever object of class created its constructor is called.
		Answer1 ans2 = new Answer1(11 ,13); // whenever object of class created its constructor is called.
	}
	
}
