package com;
/**
 * @author Akshay Kumar Modi
 */
import java.util.Scanner;

interface Test
{
	public abstract void calculate(int x, int y);
}

public class Exercise1 {

	public static void main(String[] args) {
		
		
		Scanner s1=new Scanner(System.in);
		Test t1=(x,y)->{
			System.out.println(Math.pow(x, y));
		};
		int x=s1.nextInt();
		int y=s1.nextInt();
		t1.calculate(x,y);
		

	}

}
