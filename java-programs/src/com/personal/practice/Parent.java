package com.personal.practice;

import java.io.IOException;

public class Parent {

	public void methodOne() throws IOException{
		System.out.println("executing parent class methodOne....");
	}

	public final void methodTwo() {
		System.out.println("executing parent class methodTwo");
	}
}
