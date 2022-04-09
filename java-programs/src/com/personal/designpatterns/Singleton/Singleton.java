package com.personal.designpatterns.Singleton;

import java.io.Serializable;

public class Singleton implements Serializable,Cloneable
{
	private static volatile Singleton soleInstance = null;

	private Singleton() {
		/*
		 * System.out.println("soleInstance >>" +soleInstance);
		 * if(Singleton.soleInstance != null) {
		 * System.out.println("inside condition.."); throw new
		 * RuntimeException("cannot create please use getInstance()"); }
		 */
		System.out.println("instance created....");
	}

	public static Singleton getInstance() {
		if (soleInstance == null) {
			synchronized (Singleton.class) {
				if (soleInstance == null) {
					soleInstance = new Singleton();
				}
			}
		}
		return soleInstance;
	}
	// singleton holder
	/*
	 * public static Singleton getInstance() { return Holder.INSTANCE; }
	 * 
	 * static class Holder{ static final Singleton INSTANCE = new Singleton(); }
	 */

	protected Object readResolve() {
		return soleInstance;
	}

	protected Object clone() throws CloneNotSupportedException {

		throw new CloneNotSupportedException();
	}
}
