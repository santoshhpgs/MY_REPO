package com.personal.java8features;

import java.util.function.Function;

public class Test {
public static void main(String[] args) {
	
	Function<Integer,Integer> f=i->i*i;
	System.out.println("the square of 4 is :" +f.apply(4));
}
}
