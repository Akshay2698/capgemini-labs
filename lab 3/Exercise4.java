public class Exercise4
{
	public static void main(String args[])
	{
	
		char[] ch={'A','B','C','A','B'};
		a1:
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(ch[i]==ch[j])
				{
					continue a1;
				}
			}
			int count=0;
			for(int k=0;k<ch.length;k++)
			{
			if(ch[k]==ch[i])
			{
				count++;
			}
			
			}
			System.out.println(ch[i]+"is "+count+" 	times");
		}
		
	}
}