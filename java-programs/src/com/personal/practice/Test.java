package com.personal.practice;

import java.io.IOException;

public class Test {

	public void methodone(Parent p) {
		System.out.println("parent method");
	}

	public void methodone(Child c) {
		System.out.println("child method");
	}

	public static void main(String[] args) throws IOException {
		Test test = new Test();
		Parent p = new Parent();
		p.methodOne();
		Child c = new Child();
		c.methodOne();
		Parent parent = new Child();
		parent.methodOne();
	}
}
