
class Exercise3
{
	public static void main(String args[])
	{
		int num=5629;
		boolean flag=false;
		
		int currentdig=num%10;
		num=num/10;
		
		while(num>0)
		{
			if(currentdig<=num%10)
			{
				flag=true;
				break;
			}
			currentdig=num%10;
		num=num/10;
			
		}
		if(flag)
		{
			System.out.println("number is not an increasing number");
		}
		else{System.out.println("number is an increasing number");}
		
	}
}