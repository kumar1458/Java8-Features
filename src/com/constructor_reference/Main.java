package com.constructor_reference;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Learning Constructor reference");
	
		/*
		 * Provider provider=()->{ return new Student(); };
		 */
		
		//Constructor reference
		Provider provider=Student::new;
		
		Student student=provider.getStudent();
		student.Display();
	}

}
