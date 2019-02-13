package com.personal.designpatterns.factory;

import java.io.File;
import java.util.List;

public class CSVParser implements Parser {

	public CSVParser(File file) {
		
		System.out.println("created CSV parser");
	}
	
	public List<Record> parse()
	{
		System.out.println("parsing CSV and creating record list ..");
		return null;
	}

}
