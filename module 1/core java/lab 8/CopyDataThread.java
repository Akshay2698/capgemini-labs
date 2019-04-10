import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
class ReadsText
{
	public static void main(String args[])
	{
	
	try{
		
	FileReader fr=new FileReader("C:\\javaprograms\\capgemini-assignments\\lab 8\\sourceFile.txt");
	char c[]=new char[20];
	fr.read(c);
	System.out.println(c);
	
	//writing into a file
	
	FileWriter wr=new FileWriter("C:\\javaprograms\\capgemini-assignments\\lab 8\\copiedSource.txt");
		wr.write(c);
		wr.flush();
		System.out.println("data written into copiedSource.txt file");
	}
	catch(IOException e)
	{
		System.out.println("error...");
	}
	}
}