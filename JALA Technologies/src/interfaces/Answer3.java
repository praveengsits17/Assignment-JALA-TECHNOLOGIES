package interfaces;

//Interface instances to call the implemented method in the implemented class
public class Answer3 implements Answer1 {
	
   public void implemented() // Overriding the interface method. 
	{
		System.out.println("Hello!! from the implemented method.");
		
	}

   public static void main(String[] args) 
	{
		Answer1 ans =new Answer3() ; // Parent can hold the object of child. Concept used.	
		ans.implemented();
		
	}
	
}
