package strings;
//Converting integer objects to Strings

public class Answer13 
{
	public static void main(String[] args) 
	{
		Integer intObj = new Integer(10); // Created an integer object.
	    
	    //Used toString method of Integer class to convert an Integer into String.
	    String str = intObj.toString();
	    System.out.println("Integer converted to String as " + str); //Printing the final String.
	}
}
