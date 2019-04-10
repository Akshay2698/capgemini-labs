import java.util.Map;
import java.util.HashMap;

public class Exercise3
{
	public Map<Integer,Integer> getSquares(int[] a)
	{
		Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
		
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			t=a[i]*a[i];
			m1.put(a[i],t);
		}
		return m1;
	}
	public static void main(String args[])
	{
		int[] ar={2,3,5,4};
		Exercise3 e1=new Exercise3();
		System.out.println(e1.getSquares(ar));
	}
}