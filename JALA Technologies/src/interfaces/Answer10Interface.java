package interfaces;

public class Answer10Interface implements Answer10 // Implemented the following interface.
{

	@Override
	public void add() // Overriding the method.
	{
		int x = 30 , y = 20 ;
		int z = x + y ;
		
		System.out.println("On addition result is : "+z);
		
	}
	
	public static void main(String[] args) 
	{
		Answer10 ans = new Answer10Interface();
		
		ans.add();
	}
	
	//private methods are not inherited , they are just present in the interface for the code reusability.
	
}
