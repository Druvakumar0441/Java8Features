package com.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {
	
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		int sum = list.stream().filter(n->n%2!=0).mapToInt(n->n).sum();
		System.out.println(sum);
	}
	
}
