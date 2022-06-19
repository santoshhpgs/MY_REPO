package com.personal.threads;

public class ThreadSend extends Thread {
	private String msg;
	private Sender sender;
	int i = 1;

	ThreadSend(String msg, Sender sender) {
		this.msg = msg;
		this.sender = sender;
	}

	public void run() {
		
			while (i < 10) {
				i++;
				synchronized (sender) {
				sender.send(msg,i);
			}

		}

	}
}
