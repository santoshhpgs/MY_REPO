package com.personal.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args)
{
		HashMap<Integer,String> hm = new HashMap();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		hm.put(6, "six");
		
		/*for(Map.Entry<Integer, String> entr:hm.entrySet())
		{
			System.out.println(entr.getKey()+" "+entr.getValue());
		}*/
		/*for(Integer key:hm.keySet())
		{
			System.out.println(key+" "+hm.get(key));
		}*/
		Iterator itr=hm.keySet().iterator();
		
		while(itr.hasNext())
		{
			 
			
		}
		

}

}
