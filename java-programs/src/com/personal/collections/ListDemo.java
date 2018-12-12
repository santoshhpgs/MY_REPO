package com.personal.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("10");
		al.add("11");
		al.add("12");
		al.add("13");
		al.add("14");
		al.add("11");
		al.add("15");
		al.add("16");
		al.add("11");
		al.add("17");
		al.add("18");
		al.add("11");
	//	System.out.println(al);
		//Set hs = new LinkedHashSet(al);
		
		//System.out.println(hs);
		/*System.out.println("\n==> collection stream() util....");
		al.forEach((temp) -> System.out.println(temp));*/
		/*for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
			al.remove("11");
		}*/
		
		/*for(Object i:al)
		{
			System.out.println((String)i);
			al.remove("11");
		}*/
		
		/*Iterator it = al.iterator();
		while(it.hasNext())
		{
			String value=(String)it.next();
			System.out.print(value+" ,");
			if(value.equals("11"))
				al.remove("11");
		}
		
		System.out.println(al);*/
	}
	
	
}
