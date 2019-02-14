package com.personal.threads.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

	public static void main(String[] args) {
		
		ReentrantLock rl = new ReentrantLock();
		//rl.lock();
		System.out.println(rl.isLocked());
	}

}
