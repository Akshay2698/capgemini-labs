import java.util.Map;
import java.util.HashMap;
public class Exercise2
{
	public static void main(String args[])
	{
		Map<Character,Integer> m1=new HashMap<Character,Integer>();
		char a[]={'A','B','C','A','B'};
		here:
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					continue here;
				}
				
			}
			int count=0;
			for(int k=0;k<a.length;k++)
			{
				if(a[k]==a[i])
				{count++;}
			m1.put(a[k],count);
			}
			
		}
		System.out.println(m1);
	}
}