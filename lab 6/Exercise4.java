import java.io.*;
import java.util.Scanner;
public class Exercise4
{
	
	public void checkFile(String fileLoc)
	{
		int n=fileLoc.lastIndexOf(".");
		File f1=new File(fileLoc);
		if(f1.exists())
		{
			System.out.println("file exists");
			System.out.println("Readable:"+f1.canExecute());
			System.out.println("Writable:"+f1.canExecute());
			System.out.println("File Type:"+fileLoc.substring(n));
			System.out.println("File Size:"+f1.length());
			
		}
		else
		{
		System.out.println("file does not exixts");
		}
	}
	public static void main(String args[])
	{
		
		Exercise4 e1=new Exercise4();
		Scanner s1=new Scanner(System.in);
		String fileLoc=s1.nextLine();
		e1.checkFile(fileLoc);

	}
}