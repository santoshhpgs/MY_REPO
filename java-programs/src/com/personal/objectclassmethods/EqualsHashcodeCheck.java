package com.personal.objectclassmethods;

import java.util.HashMap;
import java.util.Map;

public class EqualsHashcodeCheck 
{
    public static void main (String[] args) 
    {
         
        // creating two Objects with 
        // same state
    	/*GeekEH g1 = new GeekEH("aditya", 1);
    	GeekEH g2 = new GeekEH("aditya", 1);
         
        Map<GeekEH, String> map = new HashMap<GeekEH, String>();
        map.put(g1, "CSE");
        map.put(g2, "IT");
         
        for(GeekEH geekeh : map.keySet())
        {
            System.out.println(map.get(geekeh).toString());
        }
       */ 
        //only equals
       
       /* GeekE g1 = new GeekE("aditya", 1);
    	GeekE g2 = new GeekE("aditya", 1);
         
        Map<GeekE, String> map = new HashMap<GeekE, String>();
        map.put(g1, "CSE");
        map.put(g2, "IT");
         
        for(GeekE geeke : map.keySet())
        {
            System.out.println(map.get(geeke).toString());
        }*/
        
        //only hashcode
        GeekH g1 = new GeekH("aditya", 1);
    	GeekH g2 = new GeekH("aditya", 1);
         
        Map<GeekH, String> map = new HashMap<GeekH, String>();
        map.put(g1, "CSE");
        map.put(g2, "IT");
         
        for(GeekH geekh : map.keySet())
        {
            System.out.println(map.get(geekh).toString());
        }
    }
}