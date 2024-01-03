package com.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamClassMethods {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(11, 20, 30, 32, 40, 43, 51, 60));
		List<Integer> collect = list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
		
	}
}
