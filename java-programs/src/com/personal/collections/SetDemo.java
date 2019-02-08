package com.personal.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<String> hs= new HashSet();
		hs.add("1");
		hs.add("2");
		hs.add("3");
		hs.add("4");
		hs.add("5");
		hs.add("6");
		hs.add("7");
		hs.add("8");
		
		/*for(String s:hs)
		{
			System.out.print(" "+s);
		}*/
		
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			String element = (String)it.next();
			System.out.println(element);
		}

	}

}
