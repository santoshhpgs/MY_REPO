package com.personal.java8features;

public class ThreadDemo {

	public static void main(String[] args) {

		// thred run normal execution
		
		/*
		 * MyRunnable childThread = new MyRunnable(); Thread thread = new
		 * Thread(childThread); thread.start(); for (int i = 0; i < 10; i++) {
		 * System.out.println("main thread....."); }
		 */
		 
		//with Anonymous inner class
		Thread anonymousthread = new Thread(new  MyRunnable(){
			public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child thread.....");
			}
			}
		});
		anonymousthread.start();
		
		
		// thread run lambda execution
		/*
		 * Thread lambdathread = new Thread(() -> { for (int i = 0; i < 10; i++) {
		 * System.out.println("Child thread....."); } }); lambdathread.start();
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread.....");
		}
	}

}
