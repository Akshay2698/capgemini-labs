package com;

import java.util.Scanner;
/**
 * 
 * @author Akshay Kumar Modi
 *
 */
@FunctionalInterface
interface ChangeString
{
	public abstract void changestr(String str);
}
public class Exercise2 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		ChangeString c1=(str)->
		{
			char[] ch=str.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				System.out.print(ch[i]);
				System.out.print(" ");
			}
		};
		String str=s1.nextLine();
		c1.changestr(str);
		
	}

}
