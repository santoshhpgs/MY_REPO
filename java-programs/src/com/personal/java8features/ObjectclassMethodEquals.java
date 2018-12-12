package com.personal.java8features;

public class ObjectclassMethodEquals 
{
public static void main(String[] args) 
	{
		try {
			System.out.println("statement 1");
			System.out.println(10/0);
			System.out.println("statement 2");
			
		} finally 
		{
			System.out.println("finally");
			try {
				System.out.println("statement 3");
			}catch (ArithmeticException e)
			{
				System.out.println("inside catch");
				System.out.println(e);
			}
			System.out.println("finally end");
		}/*catch (ArithmeticException e) 
		{
			System.out.println(e);
		}*/
		System.out.println("statement 4");
	}
}
	