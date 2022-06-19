package com.personal.practice;

public class Child extends Parent {

	int i =20;
	public void methodOne() throws RuntimeException{
		System.out.println("executing Child class methodOne....");
	}
	
	public void methodThree() {
		System.out.println("executing Child class methodThree....");
	}
	
	 String methodTwo() {
		System.out.println("executing child class methodTwo");
		return null;
	}
}
