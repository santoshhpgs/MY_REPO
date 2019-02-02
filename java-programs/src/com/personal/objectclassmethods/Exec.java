package com.personal.objectclassmethods;

import java.util.HashMap;
import java.util.Map;

public class Exec {

	public static void main(String[] args) {
		Student s1 = new Student("H234");
		Student s2 = new Student("H234");
		
		//checking both Student object are equal or not	
		System.out.println(s1.equals(s2));
		
		Map<Student,ReportCard> studentReport = new HashMap<Student,ReportCard>();
		studentReport.put(s1, new ReportCard());
		studentReport.put(s2, new ReportCard());
		
		//checking how many keys allowed in map collection
		System.out.println(studentReport.size());
		System.out.println(studentReport);
	}

}
