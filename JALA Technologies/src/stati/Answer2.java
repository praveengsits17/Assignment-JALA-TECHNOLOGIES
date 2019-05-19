package stati;

//Print instance variables in static methods
public class Answer2 {
	private int x = 20; // instance variable;

	public static void printline() {
		Answer2 ans = new Answer2(); // Creating object of the class.
		System.out.println("The value of instance variable is " + ans.x);
		; // accessing the variable.
	}

	public static void main(String[] args) {
		Answer2.printline(); // As it is a static method so direcrly access the method.
	}

}
