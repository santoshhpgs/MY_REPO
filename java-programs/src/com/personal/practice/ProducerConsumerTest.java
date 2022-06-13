package com.personal.practice;

import java.util.LinkedList;

public class ProducerConsumerTest {

	int i = 0;
	LinkedList<Integer> list = new LinkedList<Integer>();

	public static void main(String[] args) {

		ProducerConsumerTest pct = new ProducerConsumerTest();
		Thread t1 = new Thread(() -> pct.produce());
		Thread t2 = new Thread(() -> pct.consume());
		t1.start();
		t2.start();
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
