package com.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsMethod {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(12,32,43,34,54,45,65,56,67,76,78,87));
		Integer max = Collections.max(list);
		System.out.println(max);
		Integer min = Collections.min(list);
		System.out.println(min);
		
		//lambda expression
		Integer max1 = list.stream().max((a,b)->a.compareTo(b)).get();
		Integer min1 = list.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println("max1 " + max1+" min1 "+min1);
		
		//method references
				Integer max2 = list.stream().max(Integer::compareTo).get();
				Integer min2 = list.stream().min(Integer::compare).get();
				System.out.println("max2 " + max2+" min2 "+min2);
		
	}
	
}
