package com.personal.java8features;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {

		/*
		 * Function<Integer,Integer> f=i->i*i; System.out.println("the square of 4 is :"
		 * +f.apply(4));
		 */

		/*
		 * String filter = "(listID contains '*rej*')";
		 * System.out.println(filter.split("contains")[1].replaceAll("\\)",
		 * "").replaceAll("\\'", "").replaceAll("\\*", "%").trim());
		 */
		/*
		 * Map<String,String> filterMap = new HashMap<>();
		 * 
		 * if(filter.contains("and")) { String[] filtertokens = filter.split("and"); for
		 * (String tokens : filtertokens)
		 * filterMap.put(tokens.split("contains")[0].replaceAll("[^a-zA-Z0-9]", ""),
		 * tokens.split("contains")[1].replaceAll("\\)", "").replaceAll("\\'",
		 * "").replaceAll("\\*", "%")); }
		 * 
		 * System.out.println("Map >>"+filterMap);
		 */

		// System.out.println(check.split("contains")[1].replaceAll("[^a-zA-Z0-9]",
		// "%"));
		// System.out.println(check.split("contains")[0]);

		// String[] arrOfStr = check.split("contains:");
		// System.out.println(check.split("contains:")[1].replaceAll("\\)",
		// "").replaceAll("\\'", "").replace("*", "%"));
		// System.out.println("STR >>"+check);
		// String str = check.replaceAll("[^a-zA-Z0-9]", " ");
		// System.out.println("STR >>"+str);
		// replace("*", "%")
		// for (String a : arrOfStr)
		// System.out.println(a);
		/*
		 * String str = "order.listID"; String[] arrOfStr = str.split("order.");
		 * System.out.println(arrOfStr.length); System.out.println(arrOfStr[1]);
		 * 
		 * for (String a : arrOfStr) System.out.println(a);
		 */

		/*
		 * Map<String,Object> filterMap = new HashMap<String, Object>();
		 * 
		 * int pageNum = 0; int pageSize = 20;
		 * 
		 * filterMap.put("pageNum",pageNum); filterMap.put("pageSize",pageSize);
		 */

		/*
		 * String check = "order.modificationDetails.updatedBy"; String[] arrOfStr =
		 * check.split("\\."); System.out.println(arrOfStr.length);
		 * System.out.println(arrOfStr[arrOfStr.length-1]); for (String a : arrOfStr)
		 * System.out.println(a);
		 */
		/*
		 * Map<String,String> filterMap = new HashMap<>(); String filter =
		 * "((listID contains 'fsda') or (keyword contains 'fsda'))"; //String filter =
		 * "((listID contains '4343') and (updatedBy contains '4322'))"; String[]
		 * filtertokens = filter.split(" or "); for (String tokens : filtertokens) {
		 * System.out.println(tokens);
		 * filterMap.put(tokens.split("contains")[0].replaceAll("[^a-zA-Z0-9]", ""),
		 * tokens.split("contains")[1].replaceAll("\\)", "").replaceAll("\\'",
		 * "").replaceAll("\\*", "%").trim()); } System.out.println(filterMap);
		 */

		/*
		 * HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		 * 
		 * // Mapping string values to int keys hash_map.put(10, "Geeks");
		 * hash_map.put(15, "4"); hash_map.put(20, "Geeks"); hash_map.put(25,
		 * "Welcomes"); hash_map.put(30, "You"); System.out.println(hash_map);
		 * hash_map.remove(20); System.out.println(hash_map);
		 */

		/*
		 * List<Integer> al = new CopyOnWriteArrayList(); Object obj = al;
		 * System.out.println(obj.getClass().isInstance(obj));
		 * 
		 * al.add(10); al.add(20); al.add(30); al.add(1); al.add(2);
		 * System.out.println(al); for(Integer i :al) { al.remove(i);
		 * System.out.println(al); }
		 */

		// String check = "order.updatedDate";
		// System.out.println(check.split("order.")[1]);

		/*
		 * String test = "Santosh"; String one = "%San"; String two = ""; String Three =
		 * ""; String four = ""; System.out.println(one.split("%")[1]);
		 * System.out.println(test.startsWith(one.split("%")[1]));
		 */
		// System.out.println(test.matches("San"));
		// System.out.println(test.toLowerCase().replaceAll("[^a-zA-Z0-9]",""));
		
		/*
		 * ArrayList al = new ArrayList(); al.add(1); al.add(2); al.add(3); al.add(4);
		 * al.add(5); System.out.println(al.stream().getClass().getName()); LocalDate ld
		 * = LocalDate.now(); System.out.println(ld);
		 */
		  
       InterfA ia = () -> System.out.println("Lambda expression implementataion");
       ia.methodA();

		/*
		 * ArrayList al = new ArrayList(); al.add(1); al.add(2); al.add(3); al.add(4);
		 * al.add(5); System.out.println(al.stream().getClass().getName()); LocalDate ld
		 * = LocalDate.now(); System.out.println(ld);
		 */

		//normal execution
		InterfA ia = new ClassA();
		ia.methodA();
		
		//lambda
		InterfA ialamda = ()-> System.out.println("method one execution....");
		ialamda.methodA();
		
		//normal excecution sum method
		InterfB ib = new ClassB();
		ib.sum(2, 3);
		
		//lambda execution sum method
		
		InterfB iblambda = (a,b)-> System.out.println("sum is >>"+(a+b));
		iblambda.sum(2, 3);

		//normal excecution sqr method
		InterfC ic = new ClassC(); 
		System.out.println("square is >"+ic.sqr(5));
		
		//lambda execution sqr method
		
		InterfC iclambda = (a)->  a*a;
		System.out.println("square is >"+iclambda.sqr(5));
		
		
	}
}
