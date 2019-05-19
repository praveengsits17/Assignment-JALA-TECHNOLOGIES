package methodoveloading;

//two methods with the same name and same number of parameters of different
//type and call from main method

public class Answer4 
{
	public void addData(String w , String x) // Method to concatenate two Strings.
	{
		String k = w +x ; // concatinating String.
		
		System.out.println("On concatination resultant string willl be : "+k);
		
	}
	
	public void addData(int k , int l ) // Method to add two numbers
	{
		int a = k + l ; // Adding two integers.
		System.out.println("On addition the result is : "+a);
	}
	
	public static void main(String[] args)
	{
		Answer4 ans = new Answer4() ;
		ans.addData(100, 300); // Method called for addition.
		ans.addData("Praveen ","Kumawat"); // Method called for concatination.
	}
	

}
