package stati;

//Print all the static, instance variables in main method
public class Answer6 
{
	public int x = 10 ; // instatnce variable .
	public static int y = 20 ; // static variable.
	
	public static void main(String[] args) 
	{
		System.out.println("Static variiable is : "+y);// can be accessed directly.
		
		Answer6 ans = new Answer6(); // class object is been created.
		System.out.println("Instatnce variable is : "+ans.x); // Class object is been used to access the instance methods.
	}
}
