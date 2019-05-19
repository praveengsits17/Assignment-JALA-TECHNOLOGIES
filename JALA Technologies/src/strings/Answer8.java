package strings;

//equalsIgnoreCase(), startsWith(), endsWith() and compareTo()

public class Answer8 
{
	public static void main(String[] args) 
	{
		String str = "hello java programmer!!!";
		String str1 = "HELLO java programmer!!!";
		
		//Comparing string irrespective of the case.equalsIgnoreCase()
		
		System.out.println("Ignoring the case , are both string same : "+str.equalsIgnoreCase(str1));
		System.out.println();
		
		//===========================================================
		
		// Using the functions to check wether the string starts or ends with following strings or not.
		
		System.out.println("Does String starts with hello ? "+str.startsWith("hello"));
		
		System.out.println("Does String ends with programmer ? "+str.endsWith("grammer!!!"));
		System.out.println();
		
		//===========================================================
		
		//Compareing the strings taking care of the case of the string.
		
		System.out.println("Are both the Strings same respective of case : "+str.compareTo(str1));
		
		// Reurns the difference in the ASCII value of the character found different.
		
		//==========================================================
		
		
	}
}
