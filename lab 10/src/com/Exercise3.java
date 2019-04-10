package com;
/**
 * @author Akshay Kumar Modi
 */
import java.util.Scanner;

interface checkInput
{
	public abstract boolean checkInput1(String username, String password);
}
public class Exercise3 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		checkInput c1=(username, password)->
		{
			if(username=="" || password=="")
			{
				return false;
			}
			else
			{
				return true;
			}
		};
		
		String username=s1.nextLine();
		String password=s1.nextLine();
		System.out.println(c1.checkInput1(username,  password));
		

	}

}
