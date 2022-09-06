package com.personal.practice;

@FunctionalInterface
public interface InterfA {

	public void methodone();
	
	 default void methodtwo()
	 {
		 System.out.println("inside InterfA methodtwo default.......");
	 }
	 
	 static void methodthree()
	 {
		 System.out.println("inside interface methodthree default.......");
	 }
}
