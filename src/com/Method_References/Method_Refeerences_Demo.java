package com.Method_References;

public class Method_Refeerences_Demo {

	public static void main(String[] args) {
		
		System.out.println("Learning method references..");
		//provide the implementation of WorkInter
	
		//static method refer
		//classname::methodname
		WorkInter workInter=Stuff::dosuff;
		workInter.dotask();
		
		Stuff obj=new Stuff();
		Runnable runnable=() -> {
			try {
				obj.printNumberHundred();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Thread thread=new Thread(runnable);
		thread.start();
	}
}
