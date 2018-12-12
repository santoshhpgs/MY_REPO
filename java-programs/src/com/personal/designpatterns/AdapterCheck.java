package com.personal.designpatterns;


/**
 * Implementation of Adapter pattern in Java. The java.util.Map has no way to
 * automatically load a two dimensional array of objects into a Map as key-value
 * pairs. This Java program creates an adapter class that does this.
 * 
 * @author WINDOWS 8
 */
public class AdapterCheck 
{

	    public static void main(String args[]) 
	    {
	        
	        Integer[][] squares = { {2, 4}, {3, 9}, {4, 16}};

	        MapAdapter adapter = new MapAdapter(squares);
	        
	        System.out.println("adapter map contains : " + adapter);
	    }

	}
