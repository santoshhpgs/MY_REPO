package com.personal.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	
	/* public void methodone(int...i) { System.out.println("var arg method"); } */
	 
	
	/*
	 * public void methodone(int i[]) { System.out.println("Array arg method"); }
	 */
	
	/*
	 * public void methodone(int i) { System.out.println("Single arg method"); }
	 */
	public static void main(String[] args) {
		
	    List<Integer> number = Arrays.asList(2,3,4,5);
	    List<Integer> square = number.stream().map(x -> x*x).
	                           collect(Collectors.toList());
	    
		/*
		 * Test test = new Test(); test.methodone(1,2,3);
		 */
		//IBRVersion value = IBRVersion.valueOf("Clearing on Process");
	    
	    for (RuleType ruleType: Arrays.asList(RuleType.values()).stream().filter(x -> x.getversions().contains(IBRVersion.COP)).collect(Collectors.toList())) {
	    	System.out.println(ruleType.getversions());
	    }
		for (RuleType ruleType: RuleType.values()) {
			System.out.println(ruleType.getversions().contains(IBRVersion.COP));
		}
	}

}
