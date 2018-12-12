package com.personal.threads;

public class Consumer extends Thread
{
	Common c;
	Consumer(Common c)
	{
		this.c=c;
	}
	public void run()
	{
		while(true)
		{
		int i = c.consume();
		System.out.println("consumer consumes :" +i);
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
