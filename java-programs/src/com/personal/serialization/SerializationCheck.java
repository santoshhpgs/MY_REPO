package com.personal.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class SerializationCheck implements Externalizable//Serializable
{
private static final long serialVersionUID = 1L;
	//int i = 10;
//	transient int i = 10;
//	transient static int i = 10;
//	transient final int i = 10;
	//String s = "check";
int i;
String s;
int j;

public SerializationCheck(String s2,int i2, int j2, int k2) {
	this.i = i;
	this.s = s;
	this.j = j;
	this.k = k;
}


	//int j = 20;
	int k = 30;

public void writeExternal(ObjectOutput out) throws IOException {
	out.writeObject(s);
	out.writeInt(j);;
	
}

public SerializationCheck() {
	System.out.println("no arg constructor");
}



public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	 s = (String)in.readObject();
	 j = in.readInt();
	
}
	
	//SerializationCheck1 srzchk1 = new SerializationCheck1();

}
