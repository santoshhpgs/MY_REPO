package com.personal.practice;

public class Practice {
	
	public void m1(String val) {
		System.out.println("inside String");
	}
	
	public void m1(Object val) {
		System.out.println("inside Integer");
	}

	public static void main(String[] args) {
		
new Practice().m1(null);


	}
}
