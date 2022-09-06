package com.personal.practice;

public class Child extends Parent {
	
	public  static int methodone() {
		return 1;
	}

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.methodone());
		System.out.println("test");
	}
}
