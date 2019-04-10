package com.cg.eis.exception;
import java.util.*;
class EmployeeException extends Exception{
	public EmployeeException(String s)
	{
		super(s);
	}
}

public class Exercise6
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int sal=s1.nextInt();
		try
		{
		if(sal<3000)
		{
			throw new EmployeeException("Employee Exception: Salary should be greater than 3000");
		}
		else
		{
			System.out.println("Salary is greater than 3000 ..Good Boy");
		}
		}
		catch(EmployeeException e)
		{
			e.getMessage();
		}
	}
}