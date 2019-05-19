package fileio;

//Write a program to read data from properties file.

import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class Answer9 
{
	public static void main(String[] args) {
		 
		try(FileReader reader = new FileReader("db.properties")) // Created instance of fileReader.
		{
			Properties properties = new Properties(); // Created instance of Properties.
			properties.load(reader); // Loading the properties file.
			String url = properties.getProperty("db.url");
			System.out.println(url );
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
