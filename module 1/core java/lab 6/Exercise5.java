import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Scanner;
public class Exercise5
{
	public boolean checkPositiveString(String str)
	{
		int count=0;
		int len=str.length();
		char[] arr=str.toCharArray();
		boolean flag=false;
		
		for(int i=0;i<len-1;i++)
		{
			if((int)arr[i]<(int)arr[i+1])
			{
				count++;
			}
			else
			{
				flag=true;
				//break;
			}
		}
		if(count==len-1)
		{
			//string is positive
			return true;
		}
		else
			if(flag)
			{
				//string is not positive
				return false;	
			}
		return false;
	}
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		String str=s1.nextLine();
		Exercise5 e1=new Exercise5();
		System.out.println(e1.checkPositiveString(str));
	}
}