package com;

/**
 * 
 * @author Akshay Kumar Modi
 *
 */
interface S{
	public abstract void display();
}
public class Exercise4 implements S {
	public void display()
	{
		System.out.println("hello akshay");
	}

	public static void main(String[] args) {
		
		S s=new Exercise4()::display;
		
		s.display();


	}

}
