package com.Method_References;

import java.time.LocalDate;

public class Stuff {

	public static void dosuff()
	{
		System.out.println("I am doing task");
		System.out.println("I am second line");
		LocalDate now=LocalDate.now();
		System.out.println(now.toString());
	}
	
	public void printNumberHundred() throws InterruptedException
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
