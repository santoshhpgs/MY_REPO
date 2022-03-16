package com.personal.object.cloning;

public class Test implements Cloneable {

	int i;
	DeepCloneCheck dcc;

	public Test(int i, DeepCloneCheck dcc) {
		this.i = i;
		this.dcc = dcc;
	}

	public Object clone() throws CloneNotSupportedException {
		DeepCloneCheck dc_new = new DeepCloneCheck(dcc.k);
		Test tst_new = new Test(i, dc_new);
		return tst_new;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		 * Test t1 = new Test(); System.out.println("t1.i = " +t1.i+" , t1.j = "+t1.j);
		 * Test t2 = (Test)t1.clone(); t1.i=30; t1.j=40; System.out.println("t2.i = "
		 * +t2.i+" , t2.j = "+t2.j); System.out.println("t1.i = "
		 * +t1.i+" , t1.j = "+t1.j);
		 */
		DeepCloneCheck dc = new DeepCloneCheck(10);
		Test tst = new Test(20, dc);
		System.out.println("tst.i = " + tst.i + " , tst.dcc.k = " + tst.dcc.k);
		Test tst_clone = (Test) tst.clone();
		tst_clone.i = 30;
		tst_clone.dcc.k = 40;
		System.out.println("tst_clone.i = " + tst_clone.i + " , tst_clone.dcc.k = " + tst_clone.dcc.k);
		System.out.println("tst.i = " + tst.i + " , tst.dcc.k = " + tst.dcc.k);
	}

}
