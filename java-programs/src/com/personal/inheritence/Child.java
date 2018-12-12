package com.personal.inheritence;

public class Child extends Parent
{
	int j=5;
	public void childMethod()
	{
		System.out.println("inside childMethod");
	}
	public void commonMethod(final int y)
	{
		System.out.println("inside child commonMethod");
	}
}
