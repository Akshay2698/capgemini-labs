package com;
/**
 * 
 * @author Akshay Kumar Modi
 *
 */
interface Fact
{
	public int calculateFactorial(int n);
}
public class Exercise5 implements Fact {
	int fact=1;
	public int calculateFactorial(int n) {
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fact f=new Exercise5()::calculateFactorial;
		
		System.out.println(f.calculateFactorial(4));

	}

}
