package com.personal.practice;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test implements interfA {

	public static void main(String[] args) throws IOException {

//		List<String> al = Arrays.asList("ab","cd","ef","gh","ij");
//		List<String> output = al.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
//		System.out.println("output >> "+output);
		Test test = new Test();
		test.methodtwo();
	}
	
	 public void methodtwo()
	 {
		 System.out.println("inside class method default.......");
	 }
	 
	@Override
	public void methodone() {

	}

}
