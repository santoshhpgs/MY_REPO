package com.personal.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializationCheck sc = new SerializationCheck();
		
		// serialization
		
		FileOutputStream fos = new FileOutputStream("abc");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sc);
		// deserialization
		FileInputStream fis = new FileInputStream("abc");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializationCheck srchk = (SerializationCheck) ois.readObject();
		System.out.println(srchk.i + "  " + srchk.j);
		
		//transient,static,final
/*		SerializationCheck sc = new SerializationCheck();
		FileOutputStream fos = new FileOutputStream("abc");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sc);
		FileInputStream fis = new FileInputStream("abc");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializationCheck srchk = (SerializationCheck) ois.readObject();
		System.out.println(srchk.i + "  " + srchk.j);*/
		
		//order of serialization
		/*SerializationCheck1 sc1 = new SerializationCheck1();
		SerializationCheck2 sc2 = new SerializationCheck2();		
		FileOutputStream fos = new FileOutputStream("abc");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sc);
		oos.writeObject(sc1);
		oos.writeObject(sc2);
		FileInputStream fis = new FileInputStream("abc");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		o=ois.readObject();
		o=ois.readObject();
		//SerializationCheck srchk = (SerializationCheck) ois.readObject();
		
		if(o instanceof SerializationCheck)
			System.out.println("SerializationCheck");
		else if(o instanceof SerializationCheck1) 
			System.out.println("SerializationCheck1");
		else if(o instanceof SerializationCheck2) 
			System.out.println("SerializationCheck2");*/
		
		
		//object graphs in serialization
		/*SerializationCheck sc = new SerializationCheck();
		FileOutputStream fos = new FileOutputStream("abc");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sc);*/
	}

}
