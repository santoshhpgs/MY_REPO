package com.personal.java8features;

public class ClassD {

	int x = 1;
	public void methodtwo()
	{
		 int x = 2;
		 InterfD id = () -> {
			System.out.println(this.x);
			System.out.println(x);
		};
		id.methodone();
	}
	public static void main(String[] args) {
		ClassD cd = new ClassD();
		cd.methodtwo();

	}

}
