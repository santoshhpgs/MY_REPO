package com.personal.threads;

public class ThreadTimeCal {
	public static void main(String[] args) {
		
		//System.out.println("Main thread time : " +System.currentTimeMillis());
		ChildThread childThread = new ChildThread();
		Thread thread = new Thread(childThread);
		//thread.setPriority(10);
        thread.start();
		for (int i = 0; i < 30; i++) {
			System.out.println("main thread priority : " +Thread.currentThread().getPriority());
			System.out.println("main Thread : " + i);
		}
		//System.out.println("ordianl_main_Thread : " + Thread.currentThread().getState());
		
	}
}
