package strings;

//Extract a string using Substring

public class Answer4 
{
	public static void main(String[] args) 
	{
		String str = "Coding is my life , Just need a proper direction."; // String instantiated.
		
		String result = str.substring(4, 20); // Method used to extract substring from a given string .
		
		System.out.println("SubString from the main String is : "+result);
	}
}
