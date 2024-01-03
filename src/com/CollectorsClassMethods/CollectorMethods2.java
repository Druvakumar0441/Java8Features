package com.CollectorsClassMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorMethods2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,1,2,3,4,5,6,7,8,9,55,55,55,66,76,67,67));
		Long collect = list.stream().collect(Collectors.counting());
		System.out.println(collect);
		Map<Integer, Long> collect2=list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
		System.out.println(collect2);
		//summing
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		IntSummaryStatistics collect3 = list2.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(collect3); 
		
		//averaging
		Double doublevalue=list2.stream().collect(Collectors.averagingInt(e->e));
		System.out.println(doublevalue);
		
		//minBy
		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(-5,1,2,3,4,5,6,7,8,9));
		Integer minby=list3.stream().collect(Collectors.minBy(Integer::compareTo)).get();
		System.out.println(minby);
		//maxBy
		Integer maxby=list3.stream().collect(Collectors.maxBy(Integer::compareTo)).get();
		System.out.println(maxby);
		//partition
		List<Integer> list4 = new ArrayList<Integer>(Arrays.asList(1,2,3,8,9,10,4,5,6,7));
		Map<Boolean, List<Integer>> collect4=list4.stream().collect(Collectors.partitioningBy(e->e>5));
		System.out.println(collect4);
		
		//joining
		List<Character> list5 = new ArrayList<Character>(Arrays.asList('j','a','v','a'));
		String collect5 =list5.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(collect5);
	}
}
