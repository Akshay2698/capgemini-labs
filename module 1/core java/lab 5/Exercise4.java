import java.util.Scanner;
public class Exercise4
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		String fname=s1.nextLine();
		String lname=s1.nextLine();
		try
		{
		if(lname.isEmpty()||fname.isEmpty())
		{
			throw new NullPointerException();
		}
		else
		System.out.print(fname+" "+lname);
		}
		catch(NullPointerException e)
		{
			System.out.println("Name field(s) should not be empty");
		}
	
		
	}
}