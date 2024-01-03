package com.lambda;

public class TestRunnablewithThread {

	public static void main(String[] args) {
		Runnable r = ()->{
			System.out.println("Run method");
			for(int i=0; i<=5 ;i++) {
				System.out.println(i);
			}
		};Thread t = new Thread(r);
		t.start();
	}
	 
	
	
}
