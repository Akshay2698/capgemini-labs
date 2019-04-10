package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise1 implements Runnable {
	
	public void run()
	{
		try {
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		//Thread thr1=new Thread(e1,"A01");
		
		ExecutorService ex=Executors.newFixedThreadPool(4);
		
		for(int i=0; i<6;i++)
		{
			Exercise1 e1=new Exercise1();
			ex.execute(e1);
		}
			
	}

}
