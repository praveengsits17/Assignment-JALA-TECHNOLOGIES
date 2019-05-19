package abstractclass;
/*Create an instance for the child class in child class and call non-abstract methods*/

public class Answer4 extends Answer1 {

	public void printName() // abstract method necessary to override in subclass.
	{
		
	}

	public void printState()// abstract method necessary to override in subclass.
	{

	}

	public static void main(String[] args) {
		Answer4 ans = new Answer4();

		ans.printGender(); // accessing the non abstract method.

		ans.printAge(); // accessing the non abstract method.

	}
}
