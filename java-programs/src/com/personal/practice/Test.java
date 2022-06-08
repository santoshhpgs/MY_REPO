package com.personal.practice;

import java.util.Collections;
import java.util.Objects;

public class Test {

	
	/* public void methodone(int...i) { System.out.println("var arg method"); } */
	 
	
	/*
	 * public void methodone(int i[]) { System.out.println("Array arg method"); }
	 */
	
	/*
	 * public void methodone(int i) { System.out.println("Single arg method"); }
	 */
	public static void main(String[] args) {
		/*
		 * Test test = new Test(); test.methodone(1,2,3);
		 */
		//IBRVersion value = IBRVersion.valueOf("Clearing on Process");
		RuleType.values().stream().filter(x -> x.versions.contains(spp)).collection(Collections::toList);
		for (RuleType ruleType: RuleType.values()) {
			System.out.println(ruleType.getversions().contains(IBRVersion.COP));
		}
	}

}
