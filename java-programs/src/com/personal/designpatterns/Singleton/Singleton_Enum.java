package com.personal.designpatterns.Singleton;

/**
 * Singleton Class using Enum
 * @author KK JavaTutorials
 */
public enum Singleton_Enum {
	
	/**
	 * This Singleton can be access globally
	 */
	GETINSTANCE;
	
	public String welcome() {
		return "Singleton!!";
	}
}
