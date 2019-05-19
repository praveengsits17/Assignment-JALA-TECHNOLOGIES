package constructor;

//Write constructors with return type int and String

public class Answer4 
{
	int x , y ,z ;
	String firstName , lastName , fullName ;
	
	public Answer4(int x , int y) // Declare a third variable in the constructor which can be accessed or return the value outside.
	{
		this.x = x ;
		this.y = y ;
		
		 z = x+y ;
	}
	
	public Answer4(String firstName , String lastName)
	{
		this.firstName = firstName ;
		this.lastName = lastName ;
		
		fullName = firstName + lastName ;
	}
	
	public static void main(String[] args) 
	{
		Answer4 k = new Answer4(10, 20); // Constructor is been called.
		
		System.out.println("Returning value from Constructor : "+k.z); // Returns the value as an integer from the constructor.
		
		Answer4 ans = new Answer4("Praveen","Kumawat");
		
		System.out.println("Returning value from Constructor : "+ans.fullName);
	}
}
