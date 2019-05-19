package fileio;

import java.io.FileOutputStream;

//a program to write text to .txt file using OutputStream
public class Answer2 
{  
	    public static void main(String args[])
	    {    
	           try
	           {    
	             FileOutputStream fout=new FileOutputStream("C://Users//a//eclipse-workspace//praveen//JALA Technologies//bin//fileio//test1.txt");    
	             String s="Hello Praveen Kumawat";    
	             byte b[]=s.getBytes();//converting string into byte array    
	             fout.write(b);//Bytes can be write into a file.    
	             fout.close();// Closing the file which is accessed.
	             System.out.println("Success");
	                
	            }
	           catch(Exception e)
	           {
	        	   System.out.println(e.getMessage()); 
	           }    
	      }    
	}  

