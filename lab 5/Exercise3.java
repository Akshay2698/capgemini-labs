import java.util.Scanner;
public class Exercise3
{
	public void checkprime(int n)
	{
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		if(count>0)
		{
			System.out.println(n+" is not a prime number");
		}
		else
		{
			System.out.println(n+" is a prime number");
		}
			
	}
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int num=s1.nextInt();
		Exercise3 e1=new Exercise3();
		e1.checkprime(num);
	}
}