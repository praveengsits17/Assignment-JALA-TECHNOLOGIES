package fileio;

import java.io.FileReader;

//Write a program to read text from .txt file using FileReader

public class Answer5 
{
	public static void main(String[] args) throws Exception 
	{
		FileReader fr = new FileReader("C://Users//a//eclipse-workspace//praveen//JALA Technologies//bin//fileio//test.txt");
		int i ;
		while((i= fr.read()) != -1)
			System.out.print((char)i);
		fr.close();
	}
}
