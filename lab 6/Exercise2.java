import java.util.Scanner;
import java.io.*;


public class Exercise2
{
	public static void main(String args[])
	{
		int i=1;
		try
		{
		Scanner s=new Scanner(new File("C:\\javaprograms\\capgemini-assignments\\lab 6\\source.txt"));
		
		while(s.hasNextLine())
		{
			
		System.out.println(i+" "+s.nextLine());
		i++;
		}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
}