package fileio;

import java.io.BufferedReader;
import java.io.FileReader;

//Read text from a .txt file using BufferedReader

public class Answer7 
{
	public static void main(String[] args) throws Exception 
	{
		BufferedReader br = null ; // Instantiating the buffered reader object.
		
		br = new BufferedReader(new FileReader("C://Users//a//eclipse-workspace//praveen//JALA Technologies//bin//fileio//test.txt")); 
	
		String content = br.readLine(); // Creating the object for reading the lines.
		
		while(content != null)
		{
			System.out.println(content);
			
			content = br.readLine();
		}
		
		br.close(); // closing the file .
	}
}
