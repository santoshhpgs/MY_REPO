package com.personal.arrays;

public class MultiArray {

	public static void main(String[] args) {

		int arr[];
		arr = new int[3];
		System.out.println(arr.length);
		String[][] subjects = {
	            { "Data Structures & Algorithms",
	              "Programming & Logic", "Software Engineering",
	              "Theory of Computation" },                       // row 1
	  
	            { "Thermodynamics", "Metallurgy",
	              "Machine Drawing",
	              "Fluid Mechanics" },                             // row2
	  
	            { "Signals and Systems", "Digital Electronics",
	              "Power Electronics" }                            // row3
	        };
	  System.out.println(subjects.length);
	  System.out.println(subjects[2][1]);

	}

}
