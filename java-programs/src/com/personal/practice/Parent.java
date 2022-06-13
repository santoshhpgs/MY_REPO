package com.personal.practice;

import java.io.IOException;

import javax.xml.crypto.NoSuchMechanismException;

public class Parent {

	public void methodOne() throws IOException{
		System.out.println("executing parent class methodOne....");
	}

	public void methodTwo() {
		System.out.println("executing parent class methodTwo");
	}
}
