package com.personal.threads;

public class Producer extends Thread
{
	Common c;
	Producer(Common c)
	{
		this.c=c;
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			c.produce(i);
			i=i+1;
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
