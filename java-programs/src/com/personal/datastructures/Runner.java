package com.personal.datastructures;

public class Runner 
{
public static void main(String[] args) {
	
	MyList ml = new MyList();
	ml.add(2);
	ml.add(3);
	ml.add(5);
	ml.add(6);
	ml.add(4, 2);
	System.out.println(ml.get(6));
	
}
}
