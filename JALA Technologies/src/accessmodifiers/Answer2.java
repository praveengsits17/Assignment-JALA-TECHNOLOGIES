package accessmodifiers;

// ApplicationAnswer2 class used to access the default methods and variables.
/*Create a class with DEFAULT fields and methods. Access these fields and methods
from any other class in the same package
*/

public class Answer2 
{
	int x = 30 ; // default variable.
	
	void printName() // default method as no access modifier used.
	{
		System.out.println("Hello Praveen Kumawat from printName method."); 
	}
}
