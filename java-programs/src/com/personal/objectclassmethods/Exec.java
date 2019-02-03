package com.personal.objectclassmethods;

import java.util.HashMap;
import java.util.Map;

public class Exec {

	public static void main(String[] args) {
		
		//checking predefined class which has already implemented hascode() and equals() method
				/*Map<String,String> stringcheck = new HashMap<String,String>();
				stringcheck.put("first", "one");
				stringcheck.put("second", "two");
				stringcheck.put("third", "three");
				System.out.println(stringcheck.size());
				System.out.println(stringcheck);
				System.out.println(stringcheck.get("first"));*/

		Student s1 = new Student("H234");
		Student s2 = new Student("H234");
		
//checking both Student object are equal or not	
//		System.out.println(s1.equals(s2));
		
		
		Map<Student,ReportCard> studentReport = new HashMap<Student,ReportCard>();
		
		studentReport.put(s1, new ReportCard());
		studentReport.put(s2, new ReportCard());
		studentReport.put(new Student("H234"), new ReportCard());
		
		//checking how many keys allowed in map collection if keys are duplicate and after and before hashcode() and equals method
		System.out.println(studentReport.size());
		System.out.println(studentReport);
		
		//strange behaviour of  studentReport.get(new Student("H234")) because of not implemented hashcode() and equals method
		System.out.println(studentReport.get(new Student("H234")));
		
		
	}
	
	//How Are Duplicate Keys Prevented in HashMap?
	//https://dzone.com/articles/how-hashmap-works-in-java
	//HashMap put(K key, V value) method implemanataion
	/*public V put(K key, V value) 
	{
	    if (key == null)
	       return putForNullKey(value);
	    int hash = hash(key.hashCode());
	    int i = indexFor(hash, table.length);
	    for (Entry<K,V> e = table[i]; e != null; e = e.next) 
	    {
	        Object k;
	        if (e.hash == hash && ((k = e.key) == key || key.equals(k))) 
	         {
	             V oldValue = e.value;
	             e.value = value;
	             e.recordAccess(this);
	             return oldValue;
	          }
	     }
	     modCount++;
	     addEntry(hash, key, value, i);
	     return null;
	 }*/

}
