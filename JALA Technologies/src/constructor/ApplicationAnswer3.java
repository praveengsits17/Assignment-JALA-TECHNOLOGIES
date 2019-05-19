package constructor;

public class ApplicationAnswer3 extends Answer3 
{
	public static void main(String[] args) 
	{
		Answer3 ans = new Answer3(); // public constrtor of parent class initialised.
		//Answer3 ans1 = new Answer3(10); // private constructor can not be initialised.
		Answer3 ans2 = new Answer3(10,20); // protetcted constructor can be accessed in the same package.
		//Answer3 ans3 = new Answer3(100 , 111,222); default constructor can not be accessed in the child class.
		
	}
}
