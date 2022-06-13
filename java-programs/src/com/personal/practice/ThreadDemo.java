package com.personal.practice;

public class ThreadDemo {

	int counter = 1;
	int MAX = 10;

	public static void main(String[] args) {

		ThreadDemo td = new ThreadDemo();

		Thread t1 = new Thread(() -> td.printOddNumber());
		Thread t2 = new Thread(() -> td.printEvenNumber());

		t1.start();
		t2.start();

	}

	public void printOddNumber() {
		synchronized (this) {
			while (counter < MAX) {
				if (counter % 2 == 0) {
					try {
						wait();
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("odd number  >> " + counter);
				counter++;
				notify();
			}

		}
	}

	public void printEvenNumber() {
		synchronized (this) {
			while (counter < MAX) {
				if (counter % 2 == 1) {
					try {
						wait();
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Even number >> " + counter);
				counter++;
				notify();
			}

		}
	}

}
