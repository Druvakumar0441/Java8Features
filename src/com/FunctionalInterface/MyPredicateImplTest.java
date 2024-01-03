package com.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyPredicateImplTest {

	public static void main(String[] args) {
		Predicate<String> pre = (s)->{
			System.out.println(s+ " Predicate Interface");
			return false;
		};pre.test("hello druva");
		
		Consumer<String> co = (c) ->  System.out.println(c+" consumer interface");
		co.accept("Hello");
		
		Function<String, Integer> fu = (f)->{
			System.out.println(f);
			return f.length();
		};System.out.println(fu.apply("Hello FUnction "));
		
		Supplier<String> su = () -> "Supplier Interface";
		System.out.println(su.get());
		
	}
	
}
