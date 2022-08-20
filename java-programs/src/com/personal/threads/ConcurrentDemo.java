package com.personal.threads;

import java.util.concurrent.locks.ReentrantLock;

import com.personal.practice.Practice;

public class ConcurrentDemo {

	ReentrantLock rl = new ReentrantLock();
	
	public static void main(String[] args) {
		ConcurrentDemo cd = new ConcurrentDemo();
		Thread t1 = new Thread(() -> cd.wish("person 1"));
		Thread t2 = new Thread(() -> cd.wish("person 2"));
		Thread t3 = new Thread(() -> cd.wish("person 3"));
		t1.start();
		t2.start();
		t3.start();
	}

	public void wish(String name) {
		rl.lock();
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning  ");
			System.out.println(name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		rl.unlock();
	}

}
