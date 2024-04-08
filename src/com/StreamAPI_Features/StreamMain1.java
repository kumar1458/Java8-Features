package com.StreamAPI_Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
		
		//Q-Create a list and filter all even number from list
		List<Integer> list1 = List.of(2,4,50,21,22,67);
		
		List<Integer> list2=new ArrayList<>();
		list2.add(12);
		list2.add(34);
		list2.add(23);
		list2.add(78);
		
		List<Integer> list3 = Arrays.asList(23,567,12,677,24);

		//list1
		/*
		 * //without stream List<Integer> listeven=new ArrayList<>();
		 * 
		 * for(Integer i:list1) { if(i%2==0) { listeven.add(i); } }
		 * System.out.println(list1); System.out.println(listeven);
		 */
		
		//USing Stremapi find even number in list 1
		
		Stream<Integer> stream = list1.stream();
		List<Integer> newList1 = stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list1);
		System.out.println(newList1);
		
		System.out.println();
		System.out.println();

		
		Stream<Integer> stream2 = list2.stream();
		List<Integer>  newList2= stream2.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list2);
		System.out.println(newList2);
		
		System.out.println();
		System.out.println();

		
		Stream<Integer> stream3 = list3.stream();
		List<Integer>  newList3= stream3.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list3);
		System.out.println(newList3);
		
		System.out.println();
		System.out.println();
		
		
		Stream<Integer> stream4 = list1.stream();
		List<Integer> collect = stream4.filter(i->i>10).collect(Collectors.toList());
		System.out.println(collect);
	}
}
