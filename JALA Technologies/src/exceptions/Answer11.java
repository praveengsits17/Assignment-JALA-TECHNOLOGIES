package exceptions;

//Write a program to generate FileNotFoundException

import java.io.File;
import java.io.FileInputStream;

public class Answer11 
{
	public static void main(String[] args) 
	{
		try 
		{
		 File file = new File("C://Users//praveen.txt");
		 FileInputStream fis = new FileInputStream(file);
		 fis.close();
		}
		catch (Exception e) 
		{
		System.err.println("FileNotFoundException occured."+e.getMessage());	
		}
		finally 
		{
			System.out.println();
			System.out.println("Our codes End");
			
		}
	}
}
