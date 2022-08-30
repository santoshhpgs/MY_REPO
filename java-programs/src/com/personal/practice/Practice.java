package com.personal.practice;

public class Practice {
	// unsortd array of inegers returns the longest consecutive element sequence
	// 50,5,4,80,2,3 --> 4 2,3,4,5,50,80
	public static void main(String[] args) {
		int array[] = {4,4,4,4,4,4,4,4,4,4};
		
		int first[] = new int[5];
		
		for(int i : array)
			first[i]=1;
		
		for(int i : first)
			System.out.print(i+" ");
		
		System.out.println();
		
		for(int i = 0; i<first.length;i++) {
		if (first[i] == 0)
			System.out.print(i+" ");
		}
		
		
		
	}

}
