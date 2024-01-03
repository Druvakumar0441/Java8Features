package com.MethodReference;

import java.util.function.Function;

class Student{
	public String name;
	public Student(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

interface MyFunctionConst{
	Student getstudent(String s);
}

public class ConstructorRef {

	public static void main(String[] args) {
		MyFunctionConst myf = Student :: new;
		System.out.println(myf.getstudent("Java is Awesome").getName());
		
		Function<String, Student> fu = Student :: new;
		System.out.println(fu.apply("Druva the Java Developer").getName());
		
	}
}
