package com.personal.practice;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {

	/*
	 * reflection serialization cloning multithreading
	 */

	private static volatile Singleton soleinstance = null;

	private Singleton() {
		if (soleinstance != null) {
			throw new RuntimeException("Instance can not be created.....");
		}
	}

	public static Singleton getInstance() {
		if (soleinstance == null) {
			synchronized (Singleton.class) {
				if (soleinstance == null) {
					soleinstance = new Singleton();
				}
			}
		}
		return soleinstance;
	}

	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	protected Object readResolve() {
		return soleinstance;
	}

}
