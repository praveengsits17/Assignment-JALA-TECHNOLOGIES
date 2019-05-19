package fileio;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

//Read text from a .txt file using BufferedInputStream

public class Answer3 
{
	public static void main(String[] args) 
	{
		InputStream is = null ; // Initialising the object of Inputstream.
		BufferedInputStream bis = null ; // Inititalising the object of BufferedInputStream.
		DataInputStream dis = null ; // Initialising the object of DataInputStream.
		
		try 
		{
			is = new FileInputStream("C://Users//a//eclipse-workspace//praveen//JALA Technologies//bin//fileio//test.txt");
			bis = new BufferedInputStream(is); // Using the object of file as a parameter.
			dis = new DataInputStream(bis);// using object of bufferedinputstream as a parameter.
			
			String temp = null ;
			while((temp = dis.readLine()) != null) // readLine method is now a days not been used soo much.
			{
				System.out.println(temp); 
			}
		
		} 
		catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
}
