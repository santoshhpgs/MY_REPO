package com.personal.threads;

public class Sender {
	public void send(String msg,int i) {
		System.out.println("sending........." + i +msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i +"..."+msg + "..........sent");
	}
}
