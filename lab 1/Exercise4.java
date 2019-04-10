class CheckPowerof2
{
	public void checkNumber(int n)
	{
		boolean flag=false;
		if(n>0) 
		{
		while(n!=1)
		{
			n=n/2;
			if(n%2!=0 && n!=1)
			{
				flag=false;
			}
		}
		}
		else{
		flag=true;
		
		}
		System.out.println(flag);
		
	}
}

public class Exercise4{
	
public static void main(String args[])
{
	CheckPowerof2 num=new CheckPowerof2();
	num.checkNumber(60);
}
}