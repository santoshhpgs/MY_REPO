package com.personal.threads;

public class Common 
{
	//static int value=0;
	static int value;
	boolean flag=true;
	public synchronized void produce(int i)
	{
	if (flag == true)
	{
		value =i;
		//value=value+1;
		System.out.println("producer produced :" +value);
		flag = false;
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
	public synchronized int consume()
	{
		if (flag==true)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag=true;
		notify();
		//value=value+1;
		return(value);
	}
}
