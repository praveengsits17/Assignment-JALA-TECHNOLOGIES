package constructor;

// Used class Answer2 here for application.

public class ApplicationAnswer2 extends Answer2
{
	public ApplicationAnswer2() // Constructor of child class.
	{
		super();
		
	}
	
	public ApplicationAnswer2(int x)  // Constructor of child class.
	{
		super(10);
	}
	
	public static void main(String[] args) 
	{
		ApplicationAnswer2 ans = new ApplicationAnswer2();
		ApplicationAnswer2 ans1 = new ApplicationAnswer2(12);
	}
}
