package com.personal.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Test implements InterfA, InterfB {

	/*
	 * public void methodtwo() {
	 * System.out.println("inside class method default......."); }
	 */

	@Override
	public void methodone() {
		System.out.println("inside class methodone ..");
	}

	@Override
	public void methodtwo() {
		// TODO Auto-generated method stub
		InterfA.super.methodtwo();
	}

	public static void main(String[] args) throws IOException {
		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}
