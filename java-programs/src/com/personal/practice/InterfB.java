package com.personal.practice;

@FunctionalInterface
public interface InterfB {

	public void methodone();
	
	 default void methodtwo()
	 {
		 System.out.println("inside InterfB methodtwo default.......");
	 }
}
