package com.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapandFlatMapDIffTest {
public static void main(String[] args) {
	/*
	 * List<String> words = new ArrayList<String>(Arrays.asList("apple", "banana",
	 * "mango", "orange"," jack")); List<Integer> collect =
	 * words.stream().map(e->e.length()).collect(Collectors.toList());
	 * System.out.println(words); System.out.println(collect);
	 */
	
	List<List<Integer>> numlist = new ArrayList<List<Integer>>();
	numlist.add(Arrays.asList(1, 2, 3, 4, 5, 6));
	numlist.add(Arrays.asList(11, 34, 22, 55, 76, 65));
	numlist.add(Arrays.asList(23, 45, 12, 54, 67, 55));
	numlist.add(Arrays.asList(34, 43, 233, 33, 53, 87));
	
	System.out.println(numlist);
	List<Integer> list=numlist.stream().flatMap(e->e.stream()).collect(Collectors.toList());
	System.out.println(list);

}
}
