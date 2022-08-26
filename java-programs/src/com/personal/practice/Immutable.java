package com.personal.practice;

public final class Immutable {

	final private int i;

	@Override
	public String toString() {
		return "Immutable [i=" + i + "]";
	}

	public Immutable(int i) {
		this.i = i;
	}
	
	public Immutable modify(int i) {
		if (i == this.i) 
			return this;
			else
				return new Immutable(i);
	}
}
