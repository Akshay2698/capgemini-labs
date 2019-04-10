import java.util.Scanner;

public class Exercise7
{
	public boolean checkUsername(String username)
	{
		boolean flag=false;
		//System.out.println(username);
		int n=username.lastIndexOf("_");
		//System.out.println(username.lastIndexOf("_"));
		//System.out.println(username.substring(n));
		String[] a=username.split("_job",2);
		
		for(String x:a)
		{
			System.out.println(x);
			int len=x.length();
			if(len>=8)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	return false;	
	}
	public static void main(String args[])
	{
		Exercise7 e1=new Exercise7();
		Scanner s1=new Scanner(System.in);
		String username=s1.nextLine();
		System.out.println(e1.checkUsername(username));
	
	}
}