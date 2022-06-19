package com.personal.practice;

import java.io.IOException;

public class Parent {

	int i =10;
	public void methodOne() throws IOException{
		System.out.println("executing parent class methodOne....");
	}

	Object methodTwo() {
		System.out.println("executing parent class methodTwo");
		return null;
	}
	
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.methodTwo();
		System.out.println(parent.i);
	}
}
