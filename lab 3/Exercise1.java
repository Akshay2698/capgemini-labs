import java.util.*;
import java.util.Collection;
import java.util.List;
public class Exercise1
{
	public int getSecondSmallest(int ar[])
	{
		List<Integer> li=new ArrayList<Integer>();
		for(int i:ar)
		{
			li.add(i);
		}
		Collections.sort(li);
		return li.get(1);
	}
	public static void main(String args[])
	{
		int a[]=new int[]{2,5,4,3};
		SecondSmallest s1=new SecondSmallest();
		
		System.out.println(s1.getSecondSmallest(a));
	}
}
