package interfaces;

// Only calling the method from interface which is been used by us.
public class AppAnswer2 implements Answer2 {

	public void implemented() // abstract method overrided.
	{
		System.out.println("Hello from implemented method.");

	}

	public void unimplemented() // No need to define the method body , if we are not accessing it. 
	{

	}

	public static void main(String[] args)
	{
		AppAnswer2 ans = new AppAnswer2(); // Creating the object of the class.
		ans.implemented();
	}
}
