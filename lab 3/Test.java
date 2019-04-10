import java.util.*;
import java.lang.Exception;
import java.util.Arrays;
import java.lang.ArrayIndexOutOfBoundsException;
public class Test
{
	public void halfUppercase(String s[]){
		Arrays.sort(s);
		
		for(int i=0;i<s.length/2;i++)
		{
		s[i]=s[i].toUpperCase();
		}
		System.out.println(Arrays.toString(s));
		
	}
	
	public static void main(String args[])
	{
		String[] str={"akshay","kumar","ball","niteesh"};
		Test t1=new Test();
		t1.halfUppercase(str);
		
	}
}
