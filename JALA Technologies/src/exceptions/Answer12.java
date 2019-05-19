package exceptions;

//Write a program to generate IOException

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Answer12 
{
	public FileInputStream testMethod1() //Returns the object as FileInputStream
	{
		File file = new File("test.txt"); // Giving the path of the file.
		
		FileInputStream fileInputStream = null; // Object of FileInputStream Created.
		try
		{
			fileInputStream = new FileInputStream(file);
			fileInputStream.read();
		}
		catch (IOException e)
		{			
			System.err.println("IOException occured : "+e.getMessage());
		}
		finally{
			try{
				if (fileInputStream != null)
				{
					fileInputStream.close(); // Closing The file.
				}
			}
			catch (IOException e)
			{
				System.err.println("IOException occured : "+e.getMessage());
			}
		}
		return fileInputStream;
	}
	//Driver method.
	public static void main(String[] args){
		Answer12 instance1 = new Answer12(); // Object of class is createed.
		instance1.testMethod1();
	}
}
