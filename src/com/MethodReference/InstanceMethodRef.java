package com.MethodReference;

import java.util.function.BiFunction;

interface MyFunction1{
	void get();
}
interface MyAddition{
	int getdata(int a, int b);
}
public class InstanceMethodRef {

	public void data() {
		System.out.println("java instance method");
	}
	public int additiondata(int a, int b) {
		System.out.println("Java Instance adddition : "+ a +b);
		return a+b;
	}
	public static void main(String[] args) {
		
		MyFunction myf = ()->{
			System.out.println("Hello Myfunction");
		}; myf.get();
		
		//Method Reference to instance method
		InstanceMethodRef ins = new InstanceMethodRef();
		MyFunction1 fun = ins :: data;
		fun.get();
		
		MyAddition add = ins :: additiondata;
		System.out.println(add.getdata(10, 20));
		
		BiFunction<Integer, Integer, Integer> bi = ins :: additiondata;
		System.out.println(bi.apply(100, 200));
	
	}
}
