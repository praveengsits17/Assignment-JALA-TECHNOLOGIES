package strings;

//Replacing characters in strings with replace()

public class Answer10 
{
	public static void main(String[] args)
	{
		String str = "Hello Praveen , keen intereset in coding"; // Initialising String.
		System.out.println("Originaly String is : "+str);
		
		System.out.println();
		System.out.println("After replacing character 'e' with character 'i' : ");
		System.out.println(str.replace('e', 'i')); // method is used replace the old character wuth new character.
	}
}
