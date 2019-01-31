package com.personal.threads;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		// For creating deadlock condition
		/*
		 * try { Thread.currentThread().join(); } catch (InterruptedException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */
		Common c = new Common();
		Producer pr = new Producer(c);
		Consumer cr = new Consumer(c);
		pr.start();
		cr.start();

	}

}
