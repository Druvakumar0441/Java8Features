package com.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMethod2 {

	public static void main(String[] args) {
		//allmatch
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(10,11,20,30,40,50,60,76,80,90));
		boolean allmatch = list.stream().allMatch(e->e%2==0);
		System.out.println(allmatch);
		//anymatch
		boolean anymatch = list.stream().anyMatch(e->e%2==0);
		System.out.println(anymatch);
		
		//nonematch
		boolean nonematch = list.stream().noneMatch(e->e%7==0);
		System.out.println(nonematch);
		
		
	}
}
