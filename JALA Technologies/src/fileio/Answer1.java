package fileio;

import java.io.FileInputStream;

//A program to read text from .txt file using InputStream

public class Answer1 {
	public static void main(String[] args) throws Exception {

		try {
			FileInputStream fin = new FileInputStream(
					"C://Users//a//eclipse-workspace//praveen//JALA Technologies//bin//fileio//test.txt");
			int i = 0; // Initialising the variable i as 0.

			while ((i = fin.read()) != -1) // read in the form of integers.
			{
				System.out.print((char) i);// converting them into characters.
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
