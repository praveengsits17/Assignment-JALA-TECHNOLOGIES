package strings;

//Searching in strings using indexOf().

public class Answer5 
{
	public static void main(String[] args) 
	{
		String str = "Hardworking is key to success";
		
		
		int result = str.indexOf('i'); // Returns the index of i firstly occured in the string.
		
		System.out.println("The first occurence of the character is : "+result);
	}
}
