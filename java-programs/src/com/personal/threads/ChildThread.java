package com.personal.threads;

public class ChildThread implements Runnable 
{

	@Override
	public void run() {
		for(int i=0;i<30;i++) {
			//Thread.currentThread().yield();
			System.out.println("child thread priority : " +Thread.currentThread().getPriority());
			System.out.println("Child Thread : " + i);
		}
		/*System.out.println("Child thread time : " +System.currentTimeMillis());
		System.out.println("ordianl_child_Thread : " + Thread.currentThread().getState());*/
	}

}
