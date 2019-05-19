package thisandsuper;

public class Answer6 
{
	int x = 10 ; // Variables declared in the class.
	int y = 20 ;
	
	public void add() //method
	{
		int z = this.x + this.y ; // Use of this keyword 
		System.out.println("On addition the result is : "+z);
	
		 int k = this.subtraction(); // Using the this key word to call the method.
		 System.out.println("On subtraction the result is : "+k);
		 
	}
	
	public int subtraction()
	{
		int z = this.y - this.x ; // use of instance variable using this keyword.
		
		return z;
		
	}
}
