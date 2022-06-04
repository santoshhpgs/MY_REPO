package com.personal.practice;

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
		for (RuleType ruleType: RuleType.values()) {
			System.out.println(ruleType.getversions().contains(IBRVersion.COP));
		}
		System.out.println(IBRVersion.COP);
		/*
		 * for (RuleType ruleType: RuleType.values()) { String packagename =
		 * ruleType.getGruop();
		 * 
		 * if(!Objects.isNull(ruleType.getGruop())) {
		 * System.out.println("packagename >> "+packagename); } }
		 */
	}

}
