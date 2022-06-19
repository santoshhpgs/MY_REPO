package com.personal.threads;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerTestPractice {

	int i = 0;
	LinkedList<Integer> list = new LinkedList<Integer>();

	public static void main(String[] args) {

//		ProducerConsumerTestPractice pct = new ProducerConsumerTestPractice();
//		Thread t1 = new Thread(() -> pct.produce());
//		Thread t2 = new Thread(() -> pct.consume());
//		Thread[] threadpoool = {t1,t2};
//		ExecutorService service = Executors.newFixedThreadPool(6);
//		for(Thread thread:threadpoool) {
//			service.submit(thread);
//		}
		
	//	t1.start();
	//	t2.start();
		
		
	}

	private void consume() {

		synchronized (this) {
			while (i<5) {
				if (list.size() == 0) {
					try {
						wait();
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Consumer consumes >> " + list.removeFirst());
				notify();
			}
		}
	}

	private void produce() {
		synchronized (this) {
			while (i<5) {
				if (list.size() == 1) {
					try {
						wait();
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("producer produces >> " + i);
				list.add(i++);
				notify();
			}
		}
	}

}
