package com.CollectorsClassMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class CollectorMethods {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9,2,4,3,6));
		//toList
		List<Integer> even =list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		//toSet
		Set<Integer> even2 =list.stream().filter(e->e%2==0).collect(Collectors.toSet());
		System.out.println(even2);
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(21, "Druva"));
		students.add(new Student(22, "sai"));
		students.add(new Student(23, "hari"));
		students.add(new Student(24, "vemu"));
		//toMap
		Map<Integer, String> even3 =students.stream().collect(Collectors.toMap(Student::getAge, Student::getName));
		System.out.println(even3);
		
		//toConMap
		List<String> list3 = new ArrayList<String>(Arrays.asList("java", "is","awesome","druva"));
		ConcurrentMap<Character, String> collectmap=list3.stream().collect(Collectors.toConcurrentMap(e->e.charAt(0), String::toUpperCase));
		System.out.println(collectmap);
		
		//toCollection
				List<String> list4 = new ArrayList<String>(Arrays.asList("java", "is","awesome","druva"));
				LinkedHashSet<String> linkedhashset=	list4.stream().collect(Collectors.toCollection(LinkedHashSet::new));
				System.out.println(linkedhashset);
		
	}
}
