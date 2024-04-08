package com.lambdaExpression;

import java.util.Iterator;

public class Thread_Demo {

	public static void main(String[] args) {
		
		
		//first thread:thread -JOHN
		
		Runnable thread1=()->{
			
			for(int i=1;i<=10;i++)
			{
				System.out.println("value of i is:" +i);
				try
				{
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				};
				
			}
		};
		Thread thread=new Thread(thread1);
		thread.setName("JOHN");
		thread.start();
	}
}
