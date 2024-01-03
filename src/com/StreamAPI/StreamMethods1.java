package com.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethods1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("java", "is","awesome", "java", "is","awesome", "druva"));
		
		Optional<String> s =list.stream().reduce((a,b) -> a+" "+b);
		System.out.println(s.get());
		
		String s2 =list.stream().reduce("",(a,b) -> a+"-"+b);
		System.out.println(s2);
		
		//Distinct method
		//list.stream().distinct().forEach(System.out::println);
		
		//sorting
		/*
		 * List<String> sorted =list.stream().sorted().collect(Collectors.toList());
		 * System.out.println(sorted);
		 */
		
		//List<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,60,70,80,90));
	//	list.stream().limit(7).forEach(System.out::println);
		
		//list.stream().skip(6).forEach(System.out::println);
		
		
		
	}
}
