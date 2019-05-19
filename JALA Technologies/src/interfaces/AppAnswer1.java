package interfaces;
// Answer1 continue....
public class AppAnswer1 implements Answer1 {

	public void implemented() {
		System.out.println("Hello I am implemented method.");

	}
	
	public static void main(String[] args) 
	{
		AppAnswer1 ans = new AppAnswer1(); // Creating the object of parent class.
		ans.implemented(); // method implemented is called.
	}

}
