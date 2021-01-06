package com.personal.designpatterns.Singleton;

/**
 * Client Program getting singleton instance 
 * of Singleton class
 * @author KK JavaTutorials
 */
public class ClientTest {

	public static void main(String[] args) {
		
		/**
		 * Calling getInstance() method many times
		 * returns same hashcode that proves that
		 * Singleton class creates only one instance
		 */
		Singleton_Enum singleton1 = Singleton_Enum.GETINSTANCE;
		Singleton_Enum singleton2 = Singleton_Enum.GETINSTANCE;
		
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
		
		String welcome = singleton1.welcome();
		System.out.println(welcome);
		
	}

}