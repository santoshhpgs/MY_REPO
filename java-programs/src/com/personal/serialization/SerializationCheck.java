package com.personal.serialization;

import java.io.Serializable;

public class SerializationCheck implements Serializable{
private static final long serialVersionUID = 1L;
	int i = 10;
//	transient int i = 10;
//	transient static int i = 10;
//	transient final int i = 10;
	int j = 20;
	
	//SerializationCheck1 srzchk1 = new SerializationCheck1();

}
