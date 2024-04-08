package com.lambdaExpression;

public class Main {
	
	public static void main(String[] args) {
		
		
		/*
		 * MyInterImp imp=new MyInterImp(); imp.sayhHellow();
		 * 
		 * 
		 * MyInter inter=new MyInter(){
		 * 
		 * @Override public void sayhHellow() {
		 * 
		 * System.out.println("hi ,anonymous"); } }; inter.sayhHellow();
		 */
		
		//Using our interface with the help of lambda
		
		MyInter i=()->{
			System.out.println("this is first time i have using lambda ");
		};
		i.sayhHellow();
		
		SumInter sumInter=( a,b)->{
			return a+b;
		};
		System.out.println(sumInter.sum(3, 4));
		System.out.println(sumInter.sum(4, 2));
		
		
		
		LengthInter lengthInter=str ->str.length();
		System.out.println("This lenght of String is :"+lengthInter.getLength("Sanjay"));
	}
	
	
	

}
