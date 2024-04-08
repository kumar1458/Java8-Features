package com.StreamAPI_Features;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
	
	public static void main(String[] args) {
		
		
		//filter(Predicate)
				//boolean value function
				//e->{ return }
				//e->e>10
		
		
		
		
		//map(Function)
		/*
		 
		 to perform Each element operation 
		 
		 
		 */
		
		
		//filter use
		List<String> names=List.of("Aman","Ankit","Abhinav","Sanjay");
		List<String> collect = names.stream().filter(e->e.startsWith("S")).collect(Collectors.toList());
		System.out.println(collect);
		
		
		//uses of map
		List<Integer> numbers=List.of(2,4,6,8,10);
		List<Integer> collect2 = numbers.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(collect2);
		
		System.out.println("-----------------");
		
		//foreach
		names.stream().forEach(e->{
			System.out.println(e);
		});;

		
		//sorted
		numbers.stream().sorted().forEach(System.out::println);
		
		System.out.println("--------------------------");
		
		
		//min,same max method
		Integer integer = numbers.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(integer);
	}

}
