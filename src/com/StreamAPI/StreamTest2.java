package com.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("Hello", "Worlds", "How", "are", "you"));
		list.stream().filter(e->e.toLowerCase().startsWith("h")).forEach(System.out::println);
		System.out.println("=========================");
		list.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("=========================");
		list.stream().map(e->e.toUpperCase()).forEach(System.out::println);
		System.out.println("=========================");
		String reduce = list.stream().reduce("",(a,b)->a+" "+b);
		System.out.println("reduced data : "+reduce);
		
	}
}
