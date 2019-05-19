package thisandsuper;

//Print the fields/instance members of the current class using this and without using object.

public class Answer1
{
	public int x = 100 ;
	public int y = 200 ;
	
	public void add() // declaring instance methood in the class , will be accessed by this keyword.
	{
		int x = 20 , y = 30 ;
		int z = x + y ;
		System.out.println(z);
	}
	
	public void printVariables()
	{
		System.out.println("Value of x is : "+this.x); // Accessing the variable with this keyword.
		System.out.println("Value of y is : "+this.y); // Accessing the variable with this keyword.
		
		this.add(); //Accessing the method with this keyword.
		
		
	}
	
	public static void main(String[] args) 
	{
		Answer1 ans = new Answer1();// Object need to created as this keyword can not be directly used in the static method.
		ans.printVariables(); // Accessing the instance method of the class .
	}
}
