package com.DefaultMethod;


interface myInterface{
	default void mydefaultMethod() {
		System.out.println("java is awesome");
	}
	static void MystaticInterfaceMethod() {
		System.out.println("interface static method");
	}
}
public class DefaultmethodInterface implements myInterface{

	public static void main(String[] args) {
		DefaultmethodInterface def = new DefaultmethodInterface();
		def.mydefaultMethod();
		myInterface.MystaticInterfaceMethod();
	}
}
