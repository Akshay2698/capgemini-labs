import java.util.StringTokenizer;

public class Exercise1
{
	public static void main(String args[])
	{
	String s="22 124 5";
	int sum=0;
	StringTokenizer st=new StringTokenizer(s);
	while(st.hasMoreTokens())
	{
		sum=sum+Integer.parseInt(st.nextToken());
	}
	System.out.println("sum is"+sum);
	}
}