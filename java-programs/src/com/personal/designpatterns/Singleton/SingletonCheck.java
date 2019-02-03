package com.personal.designpatterns.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonCheck {

	public static void main(String[] args)throws Exception
	{
		/*Pattern p = Pattern.compile("aaabbababaa");
		System.out.println("program executed");*/
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//System.out.println("S1 hashcode :" +s1.hashCode());
		//System.out.println("S2 hashcode :" +s2.hashCode());
		print("s1",s1);
		print("s2",s2);
		
		//reflection
		/*Class classz = Class.forName("com.personal.Singleton");
		Constructor<Singleton> ctor = classz.getDeclaredConstructor();
		ctor.setAccessible(true);
		Singleton s3 = ctor.newInstance();
		print("s3",s3);*/
		
		//Serialization
		
		/*ObjectOutputStream oob = new ObjectOutputStream(new FileOutputStream("test.ser"));
		oob.writeObject(s2);
		
		ObjectInputStream oib = new ObjectInputStream(new FileInputStream("test.ser"));
		Singleton s3 = (Singleton)oib.readObject();
		print("s3",s3);*/
		
		//clone
		
		/*Singleton s3 = (Singleton)s2.clone();
		print("s3",s3);*/
		
		//multithreading
		
		
		
		
		

	}
 public static void print(String name,Singleton object)
 {
	 System.out.println(String.format("Object : %s, Hashcode:%d",name,object.hashCode()));
	 
 }
}
