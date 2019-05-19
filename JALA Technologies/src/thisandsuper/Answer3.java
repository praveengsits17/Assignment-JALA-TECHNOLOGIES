package thisandsuper;

//Call constructor of the current class using this().

public class Answer3 

{
  public Answer3()		                   // Constructor 1
  {
    System.out.println("Hello "); 
  }
 
  public Answer3(String name)		      // Constructor 2
  {
    this(); // Calling the default constructor without any Parameter.
    System.out.println("Name is " + name);
  }
 
 
  public static void main(String args[])
  {
   Answer3 ans = new Answer3("Praveen Kumawat");   // Calls Constructor 3
  }
}
