package interfaces;

public class Answer11Interface implements Answer11
{
	public static void main(String[] args)
	{
		Answer11 ans = new Answer11Interface();
		
		System.out.println("The final value of variable in interface is : "+ans.x);
	}
}
