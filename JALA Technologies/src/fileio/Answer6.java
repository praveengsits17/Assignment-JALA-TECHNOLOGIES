package fileio;

import java.io.FileWriter;

//Write a program to write text to .txt file using FileWriter

public class Answer6 
{
	
	public static void main(String[] args) throws Exception
	{
		FileWriter fw = new FileWriter("C://Users//a//eclipse-workspace//praveen//JALA Technologies//bin//fileio//test1.txt");
		fw.write("Welcome Back Praveen Kumawat");
		fw.write("How are you?");
		fw.close();
		
	}
}
