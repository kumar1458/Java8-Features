package com.StreamAPI_Features;

import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		
		//Stream API -collection process
		//collection /group of object
		
		Stream<Object> emptyStream= Stream.empty();
		String names[]= {"Durgesh","Uttam","Ankit","Divya"};
		Stream<String> stream1=Stream.of(names);
		stream1.forEach(e->{
			
				System.out.println(e);
			
		});
		
	}
}
