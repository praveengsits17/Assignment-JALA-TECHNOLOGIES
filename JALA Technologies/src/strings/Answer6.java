package strings;

//Matching a String Against a Regular Expression With matches()

public class Answer6 
{
	 public static void main(String args[]) 
	 { 
	          
	      String Str = new String("Welcome back javacoder");  // Initialising string.
	        
	      // Testing if regex is present 
	      System.out.print("Does String contains regex (.*)vaco(.*) ? : " );  // Printing the given statement.
	      System.out.println(Str.matches("(.*)vaco(.*)")); // Checking wether the string matches the above given string or not.
	      // Returns the value in the form of true or false.
	 
	 }
	        
}
