package com.personal.java8features;

public class ThreadDemoWithLambda {

	public static void main(String[] args) {
		Runnable rnbl = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("child thread");
			}
		};
		Thread t = new Thread(rnbl);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

}
