package thisandsuper;

//Application of class Answer2

public class ApplicationANswer2 extends Answer2 
{
	public void childClass()
	{
		System.out.println("Value of x accessed from parent class is : "+super.x); //Accessing the variable with super.
		System.out.println("Value of y accessed from parent class is : "+super.y); //Accessing the variable with super.
		
		super.add();//method of parent class is been called using super.
	}
	
	
	public static void main(String[] args) 
	{
		ApplicationANswer2 ans = new ApplicationANswer2() ; // Object of ApplicationANswer2 is created.
		ans.childClass(); // method of the class is been used.
		
	}
}
