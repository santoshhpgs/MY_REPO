package com.personal.arrays;

public class TwoMaxNumbers 
{
	public void printTwoMaxNumbers(int[] nums){
        int maxOne = 0;
        int maxTwo = 0;
        for(int n:nums){
            if(maxOne < n){
                maxTwo = maxOne;
                maxOne =n;
                System.out.println("inside if");
                System.out.println("maxTwo >> "+maxTwo);
                System.out.println("maxOne >> "+maxOne);
            } else if(maxTwo < n){
                maxTwo = n;
                System.out.println("inside elseif");
                System.out.println("maxTwo >> "+maxTwo);
            }
        }
        System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);
    }
	public static void main(String args[]){
        int num[] = {5,34,78,2,45,1,99,23};
        TwoMaxNumbers tmn = new TwoMaxNumbers();
        tmn.printTwoMaxNumbers(num);
    }
}