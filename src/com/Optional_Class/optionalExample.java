package com.Optional_Class;

import java.util.Optional;

public class optionalExample {
	
	
	public static Optional<String> getName()
	{
		String name="Sanjay";
		return Optional.ofNullable(name);
	}

	public static void main(String[] args) {
		
		String str=null;
		
		Optional<String> optional = Optional.ofNullable(str);
	
		System.out.println(optional.isPresent());
		//System.out.println(optional.get());
		System.out.println(optional.orElse("No value is this object"));

		Optional<String> nameOptional = getName();
		System.out.println(nameOptional.orElse("null return"));

	}
}
