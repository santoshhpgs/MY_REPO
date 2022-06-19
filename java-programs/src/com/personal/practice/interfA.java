package com.personal.practice;

@FunctionalInterface
public interface interfA {

	public void methodone();
	 default void methodtwo()
	 {
		 System.out.println("inside interface method default.......");
	 }

}
