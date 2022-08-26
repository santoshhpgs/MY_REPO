package com.personal.programs;

public class StringReverse {
public static void main(String[] args) {
	String input = "Santosh";
	String output = "";
	for(int i = 0;i<input.length();i++) {
		output = input.charAt(i)+output;
	}
	System.out.println(output);
}


}
