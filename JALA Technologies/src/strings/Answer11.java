package strings;

//Splitting strings with split()
public class Answer11 
{
	public static void main(String[] args)
	{
		String str = "Hello Praveen , keen intereset in coding"; // Initialising String.
		System.out.println("Originaly String is : "+str);
	
		String arr[]=str.split(","); // Passed a regular expression to be splitted off. Remaining values stored in String array.
		
		for (String string : arr) // for each loop is been used.
		{
			System.out.println(string); //Printing the complete String array using for each loop.
		}
	
	
	}
}
