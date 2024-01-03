package com.lambda;

interface Message {
	abstract void message(String msg);
}

interface Calculator{
	abstract String message2(String msg2);
}

interface Message2 {
	abstract void message();
}
interface Calculator2{
	abstract String message();
}

interface Multiple{
	abstract int add(int a, int b);
}
public class Lambdatest1 {

	public static void main(String[] args) {
		Message message2 = (msg) -> System.out.println(msg);
		message2.message("hii iam druva");
		
		Calculator cal = (str2)->{
			return str2;
		};
		System.out.println(cal.message2("Hello Calculator"));
		
		Message2 m2 = () -> {
			System.out.println("Hello Message2");
		}; m2.message();
		
		Calculator2 c2 = () ->{
			return "Hello Clculator2";
		};
		System.out.println(c2.message());
		
		Multiple mul = (a, b)-> {
			return a+b;
		};System.out.println("Hello Mul :"+mul.add(25, 35));
		
	}
	
}
