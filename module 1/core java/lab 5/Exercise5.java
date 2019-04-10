import java.util.*;
import java.util.Scanner;

class AgeException extends Exception{
	public AgeException(String s)
	{
		super(s);
	}
}

public class Exercise5
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter age ");
		int age=s1.nextInt();
		try{
			
		if(age<=15)
		{
			throw new AgeException("Age Exception : Not Eleigible.. Age should be greater than 15");
			
		}
		else{
			System.out.println("Eligible");
		}
		}
		catch(AgeException e)
		{
			
			System.out.println(e.getMessage());
		}
	}
}