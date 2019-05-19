package strings;

// Different ways of creating String in JAVA.

public class Answer1 {
	public static void main(String[] args) {
		
		// With the help of character array //

		char ch[] = new char[] { 'P', 'R', 'A', 'V', 'E', 'E', 'N' };

		String str = new String(ch);

		System.out.println(str);
		System.out.println();

		// =========================================================//
		
		//Method 2 :- directly by instantiating object of String class.
		
		String s = "PRAVEEN KUMAWAT";
		System.out.println(s);
		System.out.println();
		
		//==========================================================//
		
		//Method 3 :- By creating the object of the String class .
		
		String str1 = new String("Welcome back");
		System.out.println(str1);
		System.out.println();
		
		//=========================================================//
		

	}
}
