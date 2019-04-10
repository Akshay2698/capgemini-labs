import java.util.Scanner;
class Exercise2
{
	public int convert(int n){
		
		int sum3,sum1=0,sum2=0;
		int sq,sq2;
		for(int i=1;i<=n;i++)
		{
			sq=i*i;
			sum1=sum1+sq;
		}
		sum2=n*(n+1)/2;
		sq2=sum2*sum2;
		
		return sum1-sq2;
	}
	
	public static void main(String args[])
	{
		Exercise2 obj=new Exercise2();
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		System.out.println(obj.convert(n));

		
	}
}