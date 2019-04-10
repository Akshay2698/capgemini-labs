public class Exercise1{
	
	public int cal(int n)
	{
		int sum=0,val=0;
		for(int i=0;i<=n;i++)
		{
			val=i*i*i;
			sum=sum+val;
		}
		return sum;
	}
	
	
	public static void main(String args[])
	{
		int num=3;
		Exercise1 e1=new Exercise1();
		System.out.println(e1.cal(num));
		
	}
}