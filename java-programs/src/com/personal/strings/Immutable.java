package com.personal.strings;

public final class Immutable {
	
	private int i;
	

	public Immutable(int i) {
		super();
		this.i = i;
	}
  public Immutable modify(int i)
  {
	if (this.i==i)
		return this;
	else
		return new Immutable(i);
  }

	public static void main(String[] args) 
	{
		Immutable imt = new Immutable(4);
		Immutable imt1 = imt.modify(5);
		Immutable imt2 = imt.modify(4);
		
		System.out.println("imt >> " +imt);
		System.out.println("imt1 >>" +imt1);
		System.out.println("imt2 >>" +imt2);

	}

}
