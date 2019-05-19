package fileio;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Write text to a .txt file using BufferedOutputStream

public class Answer4 {
	public static void main(String[] args) {
		try 
		{

			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(
					"C://Users//a//eclipse-workspace//praveen//JALA Technologies//bin//fileio//test1.txt"));
			stream.write("Hello, Praveen".getBytes()); // Writing data into the file
			stream.write(System.lineSeparator().getBytes()); // Linebreak. 
			stream.write("I am writting into a file using BufferedOutputStream".getBytes());
			stream.write(System.lineSeparator().getBytes());
			stream.close();
		} catch (IOException ex) 
		{
			ex.printStackTrace();
		}
	}
}
