package thisandsuper;

// Application of class Answer6.

public class ApplicationAnswer6 extends Answer6 
{
	public void wholesquare()
	{
		super.add(); // accessing parent class method from inside other method.
		
		// finding (a-b)whole square using super keyword.
		
		int k = super.subtraction(); // use of method of parent class.
		int result = k*k ;
		
		System.out.println("The result on performing (a-b)*(a-b) is : "+result);
	}
	
	public static void main(String[] args) 
	{
		ApplicationAnswer6 ans = new ApplicationAnswer6(); // Creating the object of the class.
		ans.wholesquare(); // Accessing the method of the class.
	}
}
