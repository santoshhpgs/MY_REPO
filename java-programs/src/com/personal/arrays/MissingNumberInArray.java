package com.personal.arrays;


/*How to find the missing number in integer array of 1 to 100?*/

public class MissingNumberInArray {
	
	public static void getMissingNumberInArray(int array[]){
		
		for (int i=0;i<array.length-1;i++)
		{
			if (!(array[i]+1 == array[i+1]))
			{
				System.out.println("misssing element in array " +(array[i]+1));
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] iArray = new int[]{1, 2, 3, 5,7,8,9,10,12,14,15,17};
		
        getMissingNumberInArray(iArray);
		

	}

}
