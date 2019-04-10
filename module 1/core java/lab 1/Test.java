class Test
{
	public static int main(String args[])
	{
		int n=60;
		
		if(n==0)
		{
			System.out.println("no");
		}
		while(n!=1)
		{
			n=n/2;
			if(n%2!=0 && n!=1)
			{
				return 0;
			}
		}
		return 1;
	}
}