package com.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethod3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,70,50, 65));
	Optional<Integer> integer	=list.stream().findFirst();
	if(integer.isPresent()) {	
	System.out.println(integer.get());
	}else {
		System.out.println("no value");
	}
	
	Optional<Integer> findany	=list.stream().filter(e->e>40).findAny();
	if(findany.isPresent()) {	
	System.out.println(findany.get());
	}else {
		System.out.println("no value");
	}
	
	System.out.println(list.stream().filter(e->e%2==0).count());
	
	}
}
