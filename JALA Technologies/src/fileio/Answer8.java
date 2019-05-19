package fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

//Write text to a .txt file using BufferedWriter

public class Answer8 
{
	public static void main(String[] args) throws Exception
	{
		BufferedWriter bw = null ;
	
		String content = "Hello Praveen Kumawat..."+"How are you doing?";
		
		File file = new File("C://Users//a//eclipse-workspace//praveen//JALA Technologies//bin//fileio//test1.txt");
	
		
		if(!file.exists())
		{
			file.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file);
		bw = new BufferedWriter(fw);
		bw.write(content);
		
		bw.close();
	}
}
