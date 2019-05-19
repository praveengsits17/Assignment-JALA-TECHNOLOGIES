package thisandsuper;

//Call argument constructor of current class using this()

public class Answer4

{
  public Answer4()		                   // Constructor 1
  {
    System.out.println("Hello ");
  }
 
  public Answer4(String name)		      // Constructor 2
  {
    this(); // Calling the default constructor.
    System.out.println("Name is " + name);
  }
 
  public Answer4(String name, int age)   // Constructor 3
  {
    this("Praveen"); // calling the parameterised constructor 2
    System.out.println("Name is " + name + " and age is " + age);
  }
 
  public static void main(String args[])
  {
   Answer4 ans = new Answer4("Praveen Kumawat", 64);   // Calls Constructor 3 with parameters.
  }
}

