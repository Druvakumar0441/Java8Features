package com.MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 10, 20, 30, 50));
	//	list.add(5);list.add(15);list.add(52);list.add(35);list.add(54);
	
		//Before Method Reference
		list.forEach(e -> System.out.println(e));
		
		//After Method Reference
		list.forEach(System.out :: println);
		
	}
}
