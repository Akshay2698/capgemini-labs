import java.util.Scanner;

class Exercise1
{
	public int calcSum(int n)
	
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
			
		}
		return sum;
	}
	public static void main(String args[])
	{
		Exercise1 obj=new Exercise1();
		System.out.println("enter a number");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		
		System.out.println("sum of first "+n+" natural numbers which are divisible by 3 or 5 is: "+obj.calcSum(n));
	}
}