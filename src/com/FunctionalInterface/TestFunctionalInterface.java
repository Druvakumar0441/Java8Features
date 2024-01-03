package com.FunctionalInterface;
@FunctionalInterface
public interface TestFunctionalInterface {

	void data1();
	
	default void data() {
		
	}
	//Object class methods also allowed
	boolean equals(Object obj);
}
