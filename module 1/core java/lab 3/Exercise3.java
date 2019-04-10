import java.util.Arrays;
import java.util.*;
import java.lang.String;
import java.lang.NullPointerException;

public class Exercise3{
	public static void main(String args[])
	{
		int a=21;
		String sb=Integer.toString(a);
		StringBuilder sb2=new StringBuilder();
		System.out.println(sb2.append(sb));
		System.out.println(sb2.reverse());	
	}
}