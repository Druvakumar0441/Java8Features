package com.MethodReference;

interface MyFunction{
	void get();
}
public class StaticMethodRef {

	public static void data() {
		System.out.println("java static method");
	}
	public static void main(String[] args) {
		MyFunction myf = ()->{
			System.out.println("Hello Myfunction");
		}; myf.get();
		
		//Method Reference to static method
		MyFunction fun = StaticMethodRef :: data;
		fun.get();
		
		
	}
}
