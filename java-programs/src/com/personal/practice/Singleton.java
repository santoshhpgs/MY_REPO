package com.personal.practice;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
	private static Singleton soleInstance = null;

	private Singleton() {

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

	protected Object readResolve() {
		return soleInstance;
	}

	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
