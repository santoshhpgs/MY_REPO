package com.personal.arrays;

public class Hello {

	  public static void main(String[] args) {

	   /* // given input
	    int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
        System.out.println();
	    // let's create another array with same length
	    // by default all index will contain zero
	    // default value for int variable

	    int[] register = new int[input.length];

	    // now let's iterate over given array to
	    // mark all present numbers in our register
	    // array

	    for (int i : input) {
	      register[i] = 1;
	    }
	    for (int i : register) {
		      System.out.print(i+" ,");
		    }
	    // now, let's print all the absentees
	    System.out.println("missing numbers in given array");

	    for (int i = 1; i < register.length; i++) {
	      if (register[i] == 0) {
	        System.out.println(i);
	      }
	    }*/
		  
		  String check = "order.createdby";
			System.out.println(check.split("\\.")[check.split("\\.").length-1]);	  
	  }
		  
		  

	}

